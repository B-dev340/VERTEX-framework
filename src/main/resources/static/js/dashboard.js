document.addEventListener('DOMContentLoaded', () => {
  // Los valores de ejemplo deben sustituirse por indicadores calculados con los registros reales.
  const labels = ['OSINT', 'Seguridad web', 'APIs', 'Factor humano', 'Forense', 'Detección', 'IA', 'Riesgos'];
  const counts = [1, 1, 1, 0, 0, 0, 0, 0];
  const palette = ['#00D4FF', '#00FF88', '#8B5CF6', '#F59E0B', '#EC4899', '#38BDF8', '#A3E635', '#F97316'];
 
const common = {
    responsive: true,
    maintainAspectRatio: false,
    animation: false,
    resizeDelay: 100,
    plugins: {
        legend: {
            position: 'bottom',
            labels: {
                color: '#cbd5e1',
                padding: 12,
                boxWidth: 10,
                font: {
                    family: 'Inter',
                    size: 11
                }
            }
        }
    }
};

  const axes = { x: { ticks: { color: '#94a3b8' }, grid: { display: false } }, y: { beginAtZero: true, ticks: { color: '#94a3b8', precision: 0 }, grid: { color: 'rgba(148,163,184,.12)' } } };
 const make = (id, config) => {
    const el = document.getElementById(id);

    if (!el || !window.Chart) return;

    const existingChart = Chart.getChart(el);

    if (existingChart) {
        existingChart.destroy();
    }

    new Chart(el, config);
};
  make('domainChart', { type: 'bar', data: { labels, datasets: [{ label: 'Laboratorios', data: counts, backgroundColor: 'rgba(0,212,255,.65)', borderColor: '#00D4FF', borderWidth: 1, borderRadius: 6 }] }, options: { ...common, scales: axes } });
  make('skillsChart', { type: 'doughnut', data: { labels: ['Análisis', 'Investigación', 'Resolución', 'Seguridad web', 'Pensamiento crítico'], datasets: [{ data: [25, 20, 20, 20, 15], backgroundColor: palette.slice(0, 5), borderColor: '#1E293B', borderWidth: 3 }] }, options: { ...common, cutout: '65%' } });
  make('radarChart', { type: 'radar', data: { labels: ['Pensamiento crítico', 'Resolución', 'Análisis', 'OSINT', 'Seguridad web', 'Investigación'], datasets: [{ label: 'Nivel de competencia', data: [82, 76, 68, 72, 70, 65], borderColor: '#00D4FF', backgroundColor: 'rgba(0,212,255,.16)', pointBackgroundColor: '#00FF88' }] }, options: { ...common, scales: { r: { min: 0, max: 100, ticks: { color: '#94a3b8', backdropColor: 'transparent' }, grid: { color: 'rgba(148,163,184,.18)' }, angleLines: { color: 'rgba(148,163,184,.18)' }, pointLabels: { color: '#cbd5e1' } } } } });
  make('timelineChart', { type: 'line', data: { labels: ['Ago', 'Sep', 'Oct', 'Nov', 'Dic'], datasets: [{ label: 'Horas prácticas', data: [3, 7, 10, 13, 13], borderColor: '#00FF88', backgroundColor: 'rgba(0,255,136,.12)', fill: true, tension: .35 }] }, options: { ...common, scales: axes } });
});
