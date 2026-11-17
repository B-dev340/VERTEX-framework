package co.edu.usta.ciberseguridad.model;

import java.time.LocalDate;
import java.util.List;

public record Lab(
    Long id, String title, LocalDate date, String category, String domain,
    String objective, List<String> tools, List<String> competencies,
    String introduction, List<String> objectives, List<String> procedure,
    String results, String conclusions, List<String> evidence, int hours
) {}
