# Framework Educativo de Ciberseguridad Aplicada

Aplicación académica desarrollada con Java 21, Spring Boot 3, Maven y Thymeleaf.

## Requisitos
- JDK 21
- Maven 3.9+
- Conexión a internet para cargar Bootstrap, Font Awesome, Chart.js, AOS y Google Fonts desde CDN.

## Ejecutar
Desde la raíz del proyecto:

```bash
mvn spring-boot:run
```

Abrir: http://localhost:8080

Para generar el ejecutable:

```bash
mvn clean package
java -jar target/framework-ciberseguridad-1.0.0.jar
```

## Estructura

```text
src/main/java/co/edu/usta/ciberseguridad/
├── FrameworkCiberseguridadApplication.java
├── controller/
│   └── WebController.java
├── model/
│   ├── Domain.java
│   └── Lab.java
└── service/
    └── FrameworkService.java

src/main/resources/
├── application.properties
├── templates/
│   ├── fragments/
│   │   ├── head.html
│   │   ├── navbar.html
│   │   ├── footer.html
│   │   └── scripts.html
│   ├── index.html
│   ├── labs.html
│   └── lab-detail.html
└── static/
    ├── css/style.css
    ├── js/app.js
    ├── js/dashboard.js
    └── images/
```

## Rutas
- `/` Inicio, presentación, arquitectura, dominios y dashboard.
- `/laboratorios` Listado con búsqueda y filtros por dominio, categoría y rango de fechas.
- `/laboratorios/{id}` Detalle del laboratorio.

## Personalización obligatoria antes de la sustentación

Los tres laboratorios iniciales y los indicadores de gráficos/competencias son **datos de demostración editables**, no afirman ser resultados reales del estudiante. Para registrar las prácticas reales:

1. Editar `FrameworkService.java` y reemplazar los objetos de ejemplo por los laboratorios desarrollados durante el semestre.
2. Actualizar fechas, objetivos, herramientas, procedimiento, resultados y conclusiones.
3. Copiar las capturas reales a `src/main/resources/static/images/`.
4. Cambiar las rutas `evidence` para apuntar a esas imágenes.
5. Actualizar los datos del gráfico en `static/js/dashboard.js` para que coincidan con los laboratorios reales.
6. Personalizar el nombre del estudiante y los datos académicos en `templates/fragments/footer.html`.

## Nota técnica
Esta versión utiliza un servicio en memoria para facilitar su ejecución y exposición académica. Los registros se reinician al reiniciar la aplicación. Para administración persistente, el siguiente paso sería incorporar Spring Data JPA, PostgreSQL, carga de archivos y un panel CRUD protegido con Spring Security.
