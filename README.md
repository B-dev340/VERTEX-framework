# VERTEX Framework
### Metodología de Evaluación y Validación de la Seguridad Informática

## Descripción

VERTEX es un framework educativo de ciberseguridad orientado a la evaluación y validación de la seguridad informática mediante una metodología estructurada de laboratorios prácticos, análisis técnico y documentación de evidencias.

El proyecto permite organizar actividades de ciberseguridad, registrar procedimientos, identificar posibles vulnerabilidades, analizar resultados y documentar competencias adquiridas durante el desarrollo de las prácticas.

## Objetivo

Establecer una metodología estructurada para desarrollar actividades de evaluación de seguridad informática en entornos controlados y autorizados, facilitando el registro de pruebas, el análisis de resultados y la mejora continua.

## Tecnologías utilizadas

- Java 21
- Spring Boot 3
- Maven
- Thymeleaf
- HTML5 y CSS3
- JavaScript
- Bootstrap 5
- Chart.js
- Font Awesome
- AOS

## Componentes del framework

El framework cuenta con los siguientes componentes:

- **Dashboard:** visualización de estadísticas y resultados de los laboratorios.
- **Gestión de laboratorios:** consulta y organización de las prácticas desarrolladas.
- **Dominios de ciberseguridad:** clasificación de las actividades por áreas de conocimiento.
- **Registro de competencias:** documentación de habilidades y conocimientos técnicos.
- **Evidencias:** consulta de documentos y resultados asociados a cada laboratorio.
- **Análisis gráfico:** representación de laboratorios, competencias, herramientas y horas prácticas.

## Dominios de trabajo

La metodología contempla diferentes áreas de la seguridad informática:

1. Sistemas Operativos y Fundamentos de Ciberseguridad.
2. OSINT y Reconocimiento.
3. Seguridad Web y Análisis de Exposición.
4. Forense Digital y Análisis de Evidencias.
5. Factor Humano e Ingeniería Social.
6. OSINT y Reconocimiento de Infraestructura.
7. Seguridad en Inteligencia Artificial.

## Laboratorios

El proyecto documenta actividades prácticas relacionadas con:

- Fundamentos de Kali Linux.
- Reconocimiento DNS.
- Análisis de exposición web.
- Esteganografía y análisis forense.
- Ingeniería social.
- Reconocimiento de infraestructura con OSINT.
- Análisis de tráfico web con Burp Suite.
- Seguridad en modelos de inteligencia artificial.
- Evaluación de vulnerabilidades con DVWA.
- Análisis automatizado con OWASP ZAP.

Cada laboratorio contiene información como objetivos, herramientas, competencias, procedimiento, resultados, conclusiones y evidencias.

## Requisitos

- JDK 21.
- Maven 3.9 o superior.
- Conexión a internet para cargar las bibliotecas externas mediante CDN.

## Instalación y ejecución

Clonar el repositorio:

```bash
git clone https://github.com/B-dev340/VERTEX-framework.git
```

Ingresar a la carpeta:

```bash
cd VERTEX-framework
```

Ejecutar la aplicación:

```bash
mvn spring-boot:run
```

Abrir en el navegador:

```text
http://localhost:8080
```

## Generar el ejecutable

```bash
mvn clean package
```

Ejecutar el archivo generado:

```bash
java -jar target/framework-ciberseguridad-1.0.0.jar
```

## Estructura del proyecto

```text
src/
└── main/
    ├── java/co/edu/usta/ciberseguridad/
    │   ├── FrameworkCiberseguridadApplication.java
    │   ├── controller/
    │   │   └── WebController.java
    │   ├── model/
    │   │   ├── Domain.java
    │   │   └── Lab.java
    │   └── service/
    │       └── FrameworkService.java
    │
    └── resources/
        ├── application.properties
        ├── templates/
        │   ├── fragments/
        │   ├── index.html
        │   ├── labs.html
        │   └── lab-detail.html
        └── static/
            ├── css/
            ├── js/
            ├── images/
            └── pdfs/
```

## Rutas principales

| Ruta | Descripción |
|---|---|
| `/` | Página principal y dashboard. |
| `/laboratorios` | Listado de laboratorios y filtros. |
| `/laboratorios/{id}` | Detalle de cada laboratorio. |

## Consideraciones de seguridad

Las actividades propuestas deben realizarse únicamente en entornos controlados o sobre sistemas que cuenten con autorización.

No se deben publicar credenciales, datos personales ni información confidencial.

## Estado del proyecto

. El framework se encuentra en proceso de construcción y documentación de sus componentes metodológicos y técnicos.

## Autoría

Proyecto académico desarrollado en el área de Ingeniería de Sistemas.

---
**VERTEX Framework – Metodología de Evaluación y Validación de la Seguridad Informática.**
