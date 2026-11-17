document.addEventListener('DOMContentLoaded', () => {
  if (window.AOS) AOS.init({ duration: 750, once: true, offset: 60 });
  const nav = document.querySelector('.site-nav');
  const onScroll = () => { if (nav) nav.classList.toggle('nav-scrolled', window.scrollY > 30); };
  window.addEventListener('scroll', onScroll, { passive: true }); onScroll();

  document.querySelectorAll('.counter').forEach(el => {
    const target = Number(el.dataset.count || 0); let current = 0;
    const step = Math.max(1, Math.ceil(target / 35));
    const timer = setInterval(() => {
      current = Math.min(target, current + step); el.textContent = current;
      if (current >= target) clearInterval(timer);
    }, 35);
  });

  // Canvas de partículas ligero, sin dependencias adicionales.
  const canvas = document.getElementById('particles');
  if (canvas) {
    const ctx = canvas.getContext('2d'); let points = [];
    const resize = () => {
      canvas.width = canvas.offsetWidth; canvas.height = canvas.offsetHeight;
      points = Array.from({ length: Math.min(65, Math.floor(canvas.width / 18)) }, () => ({
        x: Math.random() * canvas.width, y: Math.random() * canvas.height,
        vx: (Math.random() - .5) * .25, vy: (Math.random() - .5) * .25, r: Math.random() * 1.7 + .5
      }));
    };
    const draw = () => {
      ctx.clearRect(0, 0, canvas.width, canvas.height);
      points.forEach((p, i) => {
        p.x += p.vx; p.y += p.vy;
        if (p.x < 0 || p.x > canvas.width) p.vx *= -1;
        if (p.y < 0 || p.y > canvas.height) p.vy *= -1;
        ctx.beginPath(); ctx.arc(p.x, p.y, p.r, 0, Math.PI * 2);
        ctx.fillStyle = 'rgba(0,212,255,.65)'; ctx.fill();
        for (let j = i + 1; j < points.length; j++) {
          const q = points[j], d = Math.hypot(p.x - q.x, p.y - q.y);
          if (d < 105) {
            ctx.beginPath(); ctx.moveTo(p.x, p.y); ctx.lineTo(q.x, q.y);
            ctx.strokeStyle = `rgba(0,212,255,${.12 * (1 - d / 105)})`; ctx.stroke();
          }
        }
      });
      requestAnimationFrame(draw);
    };
    resize(); window.addEventListener('resize', resize); draw();
  }
});
