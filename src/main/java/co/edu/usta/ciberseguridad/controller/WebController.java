package co.edu.usta.ciberseguridad.controller;

import co.edu.usta.ciberseguridad.service.FrameworkService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import java.time.LocalDate;

@Controller
public class WebController {
    private final FrameworkService frameworkService;

    public WebController(FrameworkService frameworkService) {
        this.frameworkService = frameworkService;
    }

    @GetMapping("/")
    public String home(Model model) {
        addCommonData(model);
        return "index";
    }

    @GetMapping("/laboratorios")
    public String labs(@RequestParam(required = false) String q,
                       @RequestParam(required = false) String domain,
                       @RequestParam(required = false) String category,
                       @RequestParam(required = false) LocalDate from,
                       @RequestParam(required = false) LocalDate to, Model model) {
        addCommonData(model);
        var results = frameworkService.getLabs().stream()
            .filter(l -> q == null || q.isBlank() || l.title().toLowerCase().contains(q.toLowerCase())
                || l.objective().toLowerCase().contains(q.toLowerCase()))
            .filter(l -> domain == null || domain.isBlank() || l.domain().equals(domain))
            .filter(l -> category == null || category.isBlank() || l.category().equals(category))
            .filter(l -> from == null || !l.date().isBefore(from))
            .filter(l -> to == null || !l.date().isAfter(to))
            .toList();
        model.addAttribute("labs", results);
        model.addAttribute("query", q == null ? "" : q);
        model.addAttribute("selectedDomain", domain == null ? "" : domain);
        model.addAttribute("selectedCategory", category == null ? "" : category);
        model.addAttribute("from", from == null ? "" : from.toString());
        model.addAttribute("to", to == null ? "" : to.toString());
        model.addAttribute("categories", frameworkService.getLabs().stream().map(l -> l.category()).distinct().toList());
        return "labs";
    }

    @GetMapping("/laboratorios/{id}")
    public String labDetail(@PathVariable Long id, Model model) {
        var lab = frameworkService.findLab(id).orElse(null);
        if (lab == null) return "redirect:/laboratorios";
        addCommonData(model);
        model.addAttribute("lab", lab);
        var all = frameworkService.getLabs();
        int index = all.indexOf(lab);
        model.addAttribute("previousLab", index > 0 ? all.get(index - 1) : null);
        model.addAttribute("nextLab", index < all.size() - 1 ? all.get(index + 1) : null);
        return "lab-detail";
    }

    private void addCommonData(Model model) {
        model.addAttribute("domains", frameworkService.getDomains());
        model.addAttribute("labs", frameworkService.getLabs());
        model.addAttribute("totalLabs", frameworkService.getLabs().size());
        model.addAttribute("totalHours", frameworkService.totalHours());
        model.addAttribute("totalCompetencies", frameworkService.totalCompetencies());
    }
}
