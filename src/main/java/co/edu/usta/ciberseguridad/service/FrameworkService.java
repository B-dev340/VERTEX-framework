
package co.edu.usta.ciberseguridad.service;

import co.edu.usta.ciberseguridad.model.Domain;
import co.edu.usta.ciberseguridad.model.Lab;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class FrameworkService {

    // Únicos dominios de los laboratorios reales
    private final List<Domain> domains = List.of(

            new Domain(
                    "Sistemas Operativos y Fundamentos de Ciberseguridad",
                    "fa-terminal",
                    "Administración básica de Linux, comandos de terminal y reconocimiento inicial del sistema.",
                    "Básico",
                    100),

            new Domain(
                    "OSINT y Reconocimiento",
                    "fa-binoculars",
                    "Reconocimiento pasivo de infraestructura y recopilación de información pública.",
                    "Intermedio",
                    100),

            new Domain(
                    "Seguridad Web y Análisis de Exposición",
                    "fa-globe",
                    "Análisis de recursos web, revisión de código cliente y detección de información expuesta.",
                    "Intermedio",
                    100),

            new Domain(
                    "Forense Digital y Análisis de Evidencias",
                    "fa-magnifying-glass-chart",
                    "Análisis de archivos digitales, esteganografía, preservación de evidencias y recuperación de información oculta.",
                    "Intermedio",
                    100),

            new Domain(
                    "Factor Humano e Ingeniería Social",
                    "fa-users",
                    "Estudio del comportamiento humano, técnicas de manipulación, ingeniería social y prevención de amenazas dirigidas a los usuarios.",
                    "Intermedio",
                    100),

            new Domain(
                    "OSINT y Reconocimiento de Infraestructura",
                    "fa-diagram-project",
                    "Análisis de infraestructura digital mediante inteligencia de fuentes abiertas, reconocimiento DNS y visualización de relaciones entre entidades.",
                    "Intermedio",
                    100),

            new Domain(
                    "Seguridad en Inteligencia Artificial",
                    "fa-brain",
                    "Análisis de amenazas, evaluación de riesgos y aplicación de controles de seguridad en modelos de lenguaje y sistemas basados en inteligencia artificial.",
                    "Intermedio - Avanzado",
                    100)

    );

    // Únicamente los tres laboratorios reales
    private final List<Lab> labs = List.of(

            // LABORATORIO 1
            new Lab(
                    1L,
                    "Comandos Integrados Shell y Primeras Herramientas de Kali Linux – Parte 1",
                    LocalDate.of(2026, 06, 20),
                    "Sistemas Operativos",
                    "Sistemas Operativos y Fundamentos de Ciberseguridad",

                    "Familiarizarse con el entorno Linux y Kali Linux mediante el uso de comandos fundamentales para la administración de archivos, directorios, procesos y redes, así como realizar un reconocimiento básico de la infraestructura local.",

                    List.of(
                            "Kali Linux",
                            "Terminal Bash",
                            "Nmap",
                            "ss",
                            "ip",
                            "grep",
                            "find"),

                    List.of(
                            "Administración básica de Linux",
                            "Navegación y gestión de archivos",
                            "Análisis de redes locales",
                            "Monitoreo de procesos",
                            "Uso inicial de herramientas de seguridad"),

                    "En esta práctica se realizó un acercamiento al sistema operativo Linux, específicamente a la distribución Kali Linux, utilizando comandos de Shell para conocer la estructura del sistema, administrar archivos y directorios, consultar procesos y revisar la configuración de red. También se utilizaron herramientas básicas para realizar un reconocimiento inicial de los servicios disponibles en el entorno local.",

                    List.of(
                            "Identificar la estructura de directorios de Linux.",
                            "Realizar navegación y administración básica de archivos y carpetas.",
                            "Consultar y administrar procesos del sistema.",
                            "Identificar la configuración de red y las interfaces disponibles.",
                            "Comprobar conectividad y servicios de la red local.",
                            "Realizar una introducción al reconocimiento de puertos con Nmap."),

                    List.of(
                            "Identificar el usuario actual y la ubicación mediante whoami y pwd.",
                            "Consultar el contenido de directorios utilizando ls, ls -l y ls -la.",
                            "Crear directorios y archivos con mkdir y touch.",
                            "Crear y consultar contenido mediante echo y cat.",
                            "Copiar, mover y eliminar archivos con cp, mv y rm.",
                            "Buscar información utilizando grep y find.",
                            "Consultar manuales y ayuda con man y --help.",
                            "Identificar información del sistema mediante id, hostname y uname.",
                            "Consultar procesos utilizando ps y top.",
                            "Revisar interfaces y rutas de red con ip a e ip route.",
                            "Comprobar conectividad mediante ping.",
                            "Consultar conexiones y servicios con ss.",
                            "Realizar un reconocimiento básico del entorno local utilizando Nmap sobre localhost."),

                    "Se identificaron los principales comandos de Linux y se realizaron ejercicios de administración de archivos, consulta de procesos y revisión de la configuración de red. También se utilizó Nmap para realizar un reconocimiento inicial de los servicios disponibles en el equipo local.",

                    "La práctica permitió comprender la importancia de Linux y la terminal Shell como herramientas fundamentales en ciberseguridad. El uso de comandos básicos facilitó la administración del sistema, la revisión de procesos y el análisis de la red local. Finalmente, se reconoció la utilidad de Nmap como herramienta inicial para identificar servicios y posibles puntos de exposición.",

                    List.of(
                            "/pdfs/Lab1.pdf"),

                    3),

            // LABORATORIO 2
            new Lab(
                    2L,
                    "DNS Footprinting Pasivo con nslookup y dig en Kali Linux",
                    LocalDate.of(2026, 07, 18),
                    "OSINT y Reconocimiento",
                    "OSINT y Reconocimiento",

                    "Realizar un proceso de reconocimiento pasivo mediante técnicas de DNS Footprinting, recopilando e interpretando información pública de un dominio para identificar registros DNS, proveedores de infraestructura, servicios de correo y configuraciones relacionadas con la seguridad.",

                    List.of(
                            "Kali Linux",
                            "nslookup",
                            "dig",
                            "whois"),

                    List.of(
                            "Reconocimiento pasivo",
                            "Análisis de registros DNS",
                            "Identificación de infraestructura",
                            "Interpretación de registros DNS",
                            "Análisis de superficie de ataque"),

                    "En esta práctica se desarrolló un ejercicio de reconocimiento pasivo utilizando herramientas disponibles en Kali Linux. Se consultaron registros DNS de dominios públicos para identificar información sobre servidores de nombres, servicios de correo, direcciones IP y configuraciones de seguridad. También se analizó el proceso de resolución DNS y la información que puede obtenerse sin interactuar directamente con los sistemas objetivo.",

                    List.of(
                            "Aplicar técnicas de reconocimiento pasivo sobre dominios.",
                            "Identificar e interpretar diferentes tipos de registros DNS.",
                            "Reconocer la infraestructura DNS pública de un dominio.",
                            "Consultar configuraciones relacionadas con DNSSEC y SPF.",
                            "Comprender la jerarquía del proceso de resolución DNS.",
                            "Identificar información que permita analizar la superficie de exposición de un dominio."),

                    List.of(
                            "Verificar la conectividad y configuración de red en Kali Linux.",
                            "Realizar consultas básicas de dominios utilizando nslookup.",
                            "Identificar servidores de nombres mediante consultas NS.",
                            "Consultar servidores de correo utilizando registros MX.",
                            "Realizar consultas inversas mediante registros PTR.",
                            "Utilizar dig para consultar diferentes tipos de registros DNS.",
                            "Analizar el proceso de resolución mediante dig +trace.",
                            "Consultar registros DNSKEY y DS relacionados con DNSSEC.",
                            "Consultar información pública del dominio utilizando whois.",
                            "Interpretar la infraestructura, tecnologías, dependencias y configuraciones de seguridad identificadas."),

                    "Se recopilaron e interpretaron registros DNS mediante nslookup y dig. Las consultas permitieron identificar servidores de nombres, servicios de correo, información de resolución y otros datos públicos relacionados con la infraestructura del dominio.",

                    "El DNS Footprinting constituye una etapa importante del reconocimiento pasivo en ciberseguridad. Mediante las consultas realizadas fue posible comprender cómo se obtiene información pública de un dominio, identificar proveedores y servicios asociados, y reconocer controles como DNSSEC y SPF. Esta información permite comprender mejor la infraestructura y evaluar posibles puntos de exposición.",

                    List.of(
                            "/pdfs/Lab2.pdf"),

                    2),

            // LABORATORIO 3
            new Lab(
                    3L,
                    "Clonación Controlada de un Sitio Web con HTTrack y Análisis de Exposición",
                    LocalDate.of(2026, 07, 26),
                    "Seguridad Web",
                    "Seguridad Web y Análisis de Exposición",

                    "Realizar una copia controlada de un sitio web autorizado mediante HTTrack, con el propósito de inspeccionar los recursos descargados, archivos, solicitudes HTTP, posibles llamadas a API y elementos que puedan exponer información del lado del cliente. La práctica se desarrolló sobre sitios de prueba alojados en Netlify.",

                    List.of(
                            "Kali Linux",
                            "HTTrack",
                            "Netlify",
                            "Python HTTP Server",
                            "grep"),

                    List.of(
                            "Clonación controlada de sitios web",
                            "Análisis de código del cliente",
                            "Identificación de exposición de información",
                            "Inspección de recursos web",
                            "Seguridad en aplicaciones frontend"),

                    "En esta práctica se utilizó HTTrack para realizar una copia local y controlada de un sitio web de prueba autorizado. Posteriormente, se inspeccionaron los recursos descargados, incluyendo archivos HTML, CSS, JavaScript e imágenes, con el objetivo de identificar posibles exposiciones de información, direcciones de API, endpoints y configuraciones visibles desde el navegador.",

                    List.of(
                            "Conocer el funcionamiento de la herramienta HTTrack.",
                            "Realizar una copia local de un sitio web autorizado.",
                            "Analizar los recursos descargados durante la clonación.",
                            "Inspeccionar archivos HTML, CSS, JavaScript e imágenes.",
                            "Identificar posibles exposiciones de información, API, endpoints y configuraciones.",
                            "Comprender la importancia de las buenas prácticas de desarrollo web seguro."),

                    List.of(
                            "Publicar un sitio web de prueba en Netlify.",
                            "Verificar e instalar HTTrack en el entorno Kali Linux.",
                            "Preparar el entorno de trabajo para realizar la práctica.",
                            "Revisar la sintaxis y opciones principales de HTTrack.",
                            "Realizar una clonación controlada utilizando los filtros correspondientes.",
                            "Inspeccionar los directorios y archivos descargados.",
                            "Iniciar un servidor HTTP local utilizando Python.",
                            "Comparar el sitio web original con la copia local.",
                            "Buscar posibles API, tokens, claves y direcciones URL mediante grep.",
                            "Clasificar los hallazgos identificados durante la revisión."),

                    "Se obtuvo una copia local del sitio web de prueba y se inspeccionaron los recursos descargados. La revisión permitió identificar elementos visibles del lado del cliente, como código HTML, JavaScript, direcciones URL y posibles configuraciones expuestas.",

                    "La práctica permitió comprender que herramientas como HTTrack descargan recursos accesibles desde el navegador, pero no permiten obtener directamente el código del servidor backend. También se evidenció que los archivos HTML y JavaScript pueden contener información que debe protegerse adecuadamente. El análisis de recursos del lado del cliente ayuda a identificar posibles exposiciones y resalta la importancia de separar correctamente las responsabilidades del frontend y el backend.",

                    List.of(
                            "/pdfs/Lab3.pdf"),

                    3),

            // LABORATORIO 4
            new Lab(
                    4L,
                    "Esteganografía y Análisis Forense Digital con Steghide en Kali Linux",
                    LocalDate.of(2026, 8, 10),
                    "Forense Digital",
                    "Forense Digital y Análisis de Evidencias",

                    "Integrar técnicas de esteganografía y análisis forense digital mediante el uso de Steghide y diferentes herramientas de Kali Linux. La práctica se desarrolló en tres fases: ocultamiento de información en imágenes, análisis forense de archivos sospechosos y un reto de investigación para diferenciar evidencias normales, archivos con información concatenada y archivos con contenido oculto.",

                    List.of(
                            "Kali Linux",
                            "Steghide",
                            "ExifTool",
                            "Strings",
                            "Binwalk",
                            "SHA256sum",
                            "File"),

                    List.of(
                            "Esteganografía digital",
                            "Preservación de evidencia digital",
                            "Análisis forense de archivos",
                            "Recuperación de información oculta",
                            "Verificación de integridad mediante SHA-256",
                            "Análisis de metadatos",
                            "Identificación de técnicas de ocultamiento",
                            "Correlación de evidencias digitales"),

                    "Este laboratorio integró tres fases complementarias orientadas al estudio de la esteganografía y el análisis forense digital. Inicialmente se aprendió a ocultar información dentro de imágenes utilizando Steghide. Posteriormente, se aplicaron técnicas forenses para identificar y recuperar información oculta en archivos sospechosos. Finalmente, se desarrolló un reto práctico para diferenciar evidencias normales, archivos con información concatenada y archivos con contenido oculto mediante esteganografía. La práctica permitió comprender cómo identificar, preservar, analizar y recuperar información digital.",

                    List.of(
                            "Comprender los fundamentos de la esteganografía aplicada a imágenes digitales.",
                            "Utilizar Steghide para ocultar y recuperar información dentro de archivos JPG.",
                            "Aplicar procedimientos de análisis forense sobre archivos sospechosos.",
                            "Analizar metadatos, hashes e indicadores de posible ocultamiento de información.",
                            "Diferenciar entre concatenación de archivos, esteganografía y criptografía.",
                            "Recuperar información oculta y verificar su integridad mediante funciones hash SHA-256.",
                            "Correlacionar resultados obtenidos con distintas herramientas forenses para formular conclusiones sustentadas."),

                    List.of(
                            "FASE 1. OCULTAMIENTO DE INFORMACIÓN",
                            "Crear el entorno de trabajo en Kali Linux.",
                            "Obtener una imagen JPG para utilizarla como archivo contenedor.",
                            "Crear un archivo de texto con información secreta.",
                            "Verificar el tipo de imagen mediante el comando file.",
                            "Insertar el archivo secreto dentro de la imagen utilizando steghide embed.",
                            "Generar una imagen esteganográfica protegida mediante contraseña.",
                            "Verificar visualmente que la imagen conserve su apariencia normal.",
                            "Extraer el contenido mediante steghide extract.",
                            "Comparar los hashes SHA-256 del archivo original y del recuperado.",

                            "FASE 2. ANÁLISIS FORENSE DE EVIDENCIA DIGITAL",
                            "Crear una copia de la evidencia para preservar el archivo original.",
                            "Identificar el tipo real de archivo utilizando file.",
                            "Obtener y registrar hashes SHA-256 para verificar la integridad.",
                            "Analizar metadatos mediante ExifTool.",
                            "Inspeccionar cadenas de texto visibles utilizando strings.",
                            "Buscar firmas y datos incrustados mediante binwalk.",
                            "Investigar posibles contenidos ocultos utilizando steghide info.",
                            "Realizar la recuperación controlada de la evidencia oculta.",
                            "Verificar la integridad de la información extraída.",
                            "Documentar los hallazgos y correlacionar los resultados de las herramientas.",

                            "FASE 3. RETO DE INVESTIGACIÓN FORENSE",
                            "Preparar tres evidencias: una imagen de control, una imagen con información oculta mediante Steghide y una imagen con información concatenada al final del archivo.",
                            "Aplicar file, sha256sum, ExifTool, strings, binwalk y Steghide sobre las evidencias.",
                            "Comparar los resultados obtenidos en cada archivo.",
                            "Formular hipótesis sobre el mecanismo utilizado para modificar u ocultar la información.",
                            "Identificar la evidencia normal, la evidencia concatenada y la evidencia esteganográfica.",
                            "Recuperar el contenido oculto utilizando la contraseña proporcionada.",
                            "Validar la integridad mediante hashes SHA-256.",
                            "Elaborar el informe forense con los hallazgos obtenidos."),

                    "Se desarrollaron ejercicios de ocultamiento y extracción de información en imágenes JPG, análisis de metadatos, identificación de firmas y búsqueda de contenido incrustado. También se compararon tres tipos de evidencias para identificar archivos normales, archivos concatenados y archivos con información oculta mediante esteganografía. La verificación con SHA-256 permitió comprobar la integridad de la información recuperada.",

                    "La esteganografía permite ocultar información dentro de archivos multimedia sin modificar necesariamente su apariencia visual. Por ello, la inspección visual de una imagen no es suficiente para determinar si contiene información oculta. El análisis forense requiere preservar la evidencia y verificar su integridad mediante funciones hash. Herramientas como ExifTool, Strings y Binwalk proporcionan indicios que deben interpretarse conjuntamente. Además, se identificó la diferencia entre concatenación y esteganografía, y se comprobó la importancia de correlacionar diferentes resultados para formular conclusiones precisas.",

                    List.of(
                            "/pdfs/Lab4p1.pdf","/pdfs/Lab4p2.pdf","/pdfs/Lab4p3.pdf"),

                    6),

            // LABORATORIO 5
            new Lab(
                    5L,
                    "Ingeniería Social: Principios, Técnicas y Análisis de Escenarios",
                    LocalDate.of(2026, 8, 28),
                    "Concienciación y Seguridad del Usuario",
                    "Factor Humano e Ingeniería Social",

                    "Estudiar el factor humano dentro de la ciberseguridad, analizando cómo los atacantes utilizan técnicas de manipulación, persuasión y construcción de confianza para obtener información o provocar acciones específicas. Mediante escenarios académicos se identificaron modalidades de ingeniería social, mecanismos de persuasión e indicadores que permiten reconocer intentos de engaño.",

                    List.of(
                            "Casos de estudio",
                            "Análisis de escenarios",
                            "Correo electrónico simulado",
                            "Códigos QR",
                            "Matrices de análisis"),

                    List.of(
                            "Análisis de amenazas basadas en el factor humano",
                            "Identificación de phishing y sus variantes",
                            "Evaluación de mecanismos de persuasión",
                            "Reconocimiento de indicadores de alerta",
                            "Aplicación de medidas preventivas",
                            "Pensamiento crítico frente a intentos de manipulación"),

                    "El laboratorio estuvo orientado al estudio de los principios de la ingeniería social y su impacto en la ciberseguridad. Se analizaron técnicas mediante las cuales los atacantes manipulan a las personas utilizando autoridad, urgencia, confianza y curiosidad. A través de escenarios académicos se estudiaron diferentes modalidades de engaño y se identificaron indicadores de riesgo y medidas preventivas para proteger a las personas y organizaciones.",

                    List.of(
                            "Comprender los principios fundamentales de la ingeniería social.",
                            "Identificar técnicas comunes utilizadas por atacantes para manipular a las personas.",
                            "Diferenciar phishing, smishing, vishing, pretexting, baiting y quishing.",
                            "Analizar escenarios simulados para determinar objetivos, pretextos y mecanismos de persuasión.",
                            "Reconocer indicadores de alerta en mensajes, llamadas, códigos QR y otros medios de comunicación.",
                            "Diseñar y evaluar escenarios ficticios de ingeniería social con fines académicos.",
                            "Proponer medidas preventivas para reducir los riesgos asociados a este tipo de ataques."),

                    List.of(
                            "FASE 1. COMPRENSIÓN DE LOS FUNDAMENTOS",
                            "Estudiar el concepto de ingeniería social y su importancia en la ciberseguridad.",
                            "Analizar el papel de la manipulación, la confianza y la persuasión en los ataques dirigidos a personas.",
                            "Identificar los componentes básicos de un ataque: pretexto, autoridad, urgencia, solicitud y objetivo.",

                            "FASE 2. IDENTIFICACIÓN DE TÉCNICAS",
                            "Analizar las técnicas de phishing, smishing, vishing, pretexting, baiting, quishing, tailgating e impersonation.",
                            "Diferenciar las modalidades según el canal utilizado y el mecanismo de manipulación.",

                            "FASE 3. ANÁLISIS DE ESCENARIOS",
                            "Analizar un correo electrónico fraudulento relacionado con almacenamiento institucional.",
                            "Evaluar una llamada telefónica de un supuesto soporte técnico.",
                            "Analizar un dispositivo USB utilizado como señuelo.",
                            "Examinar un código QR diseñado para redirigir a un sitio de interés para un atacante.",
                            "Identificar en cada escenario el objetivo, canal, pretexto, mecanismo de persuasión, acción solicitada y técnica empleada.",
                            "Reconocer indicadores de riesgo y proponer medidas preventivas.",

                            "FASE 4. CONSTRUCCIÓN DE ESCENARIOS",
                            "Definir el contexto del escenario ficticio.",
                            "Establecer el objetivo que se busca representar.",
                            "Seleccionar el canal de comunicación.",
                            "Crear un pretexto académico y ficticio.",
                            "Definir el mecanismo de persuasión y la acción solicitada.",
                            "Clasificar el escenario según la técnica de ingeniería social utilizada.",

                            "FASE 5. INTERCAMBIO Y ANÁLISIS",
                            "Elaborar un escenario ficticio por cada estudiante.",
                            "Intercambiar el escenario con un compañero.",
                            "Realizar un análisis independiente sin conocer la clasificación original.",
                            "Identificar el objetivo, canal, pretexto, técnica e indicadores de alerta.",
                            "Comparar la intención del autor con la interpretación del compañero.",
                            "Discutir los hallazgos y elaborar conclusiones."),

                    "Se analizaron diferentes técnicas de ingeniería social mediante escenarios académicos relacionados con correos electrónicos, llamadas telefónicas, dispositivos USB y códigos QR. Se identificaron los objetivos, canales, pretextos, mecanismos de persuasión e indicadores de riesgo. También se construyeron e intercambiaron escenarios ficticios para evaluar la capacidad de reconocer intentos de manipulación.",

                    "La ingeniería social explota principalmente el comportamiento humano y no necesariamente vulnerabilidades tecnológicas. Los atacantes combinan elementos como autoridad, urgencia, confianza y curiosidad para aumentar las probabilidades de éxito. Técnicas como phishing, vishing, smishing y quishing utilizan diferentes canales, pero comparten objetivos similares. La identificación temprana de indicadores sospechosos y la verificación mediante canales oficiales son medidas fundamentales para prevenir estos ataques. Finalmente, el análisis estructurado de escenarios fortalece el pensamiento crítico y la capacidad de respuesta frente a amenazas relacionadas con el factor humano.",

                    List.of(
                            "/pdfs/Lab5.pdf"),

                    4),

            // LABORATORIO 6
            new Lab(
                    6L,
                    "Reconocimiento Pasivo de Infraestructura Digital con Maltego (OSINT y Footprinting)",
                    LocalDate.of(2026, 10, 18),
                    "Reconocimiento Pasivo",
                    "OSINT y Reconocimiento de Infraestructura",

                    "Aplicar técnicas de reconocimiento pasivo utilizando Maltego Community Edition, una herramienta especializada en inteligencia de fuentes abiertas (OSINT) y análisis visual de relaciones. Mediante el estudio de un dominio público se identificaron componentes de infraestructura como servidores DNS, servidores de correo, direcciones IP, rangos de red y sistemas autónomos, permitiendo construir una representación de la arquitectura tecnológica sin realizar actividades intrusivas.",

                    List.of(
                            "Kali Linux",
                            "Maltego Community Edition",
                            "DNS",
                            "Whois",
                            "Dig"),

                    List.of(
                            "Inteligencia de fuentes abiertas (OSINT)",
                            "Reconocimiento pasivo",
                            "Footprinting de infraestructura",
                            "Análisis DNS avanzado",
                            "Identificación de proveedores tecnológicos",
                            "Interpretación de grafos de relaciones",
                            "Mapeo de infraestructura digital",
                            "Investigación y correlación de información pública"),

                    "Este laboratorio tuvo como finalidad aplicar técnicas de reconocimiento pasivo utilizando Maltego, una plataforma especializada en inteligencia de fuentes abiertas (OSINT) y análisis visual de relaciones. A través del estudio de un dominio público se identificaron componentes de infraestructura como servidores DNS, servidores de correo, direcciones IP, rangos de red y sistemas autónomos, permitiendo construir una visión estructurada de la arquitectura tecnológica asociada a un objetivo sin realizar actividades intrusivas.",

                    List.of(
                            "Comprender el funcionamiento de Maltego como herramienta de reconocimiento pasivo.",
                            "Aplicar técnicas OSINT sobre dominios públicos.",
                            "Identificar registros MX, NS, SOA y SPF asociados a un dominio.",
                            "Descubrir direcciones IP relacionadas con la infraestructura analizada.",
                            "Identificar rangos de red (Netblocks) asociados a direcciones IP.",
                            "Analizar sistemas autónomos (ASN) y proveedores de infraestructura.",
                            "Representar visualmente relaciones entre múltiples entidades mediante grafos.",
                            "Interpretar cómo diferentes servicios tecnológicos participan en la infraestructura digital de una organización."),

                    List.of(
                            "FASE 1. CONFIGURACIÓN DEL ENTORNO",
                            "Iniciar Kali Linux.",
                            "Abrir Maltego Community Edition.",
                            "Verificar las transformaciones disponibles en Utilities.",
                            "Crear un nuevo grafo para iniciar la investigación.",

                            "FASE 2. CREACIÓN DE LA ENTIDAD PRINCIPAL",
                            "Seleccionar la entidad Domain.",
                            "Incorporar el dominio objetivo al grafo.",
                            "Utilizar tesla.com como punto inicial del análisis.",
                            "Organizar inicialmente los elementos visuales.",

                            "FASE 3. IDENTIFICACIÓN DE INFRAESTRUCTURA DE CORREO",
                            "Ejecutar la transformación MX.",
                            "Obtener los servidores de correo asociados al dominio.",
                            "Interpretar los registros encontrados.",
                            "Verificar los resultados mediante consultas DNS complementarias.",

                            "FASE 4. ANÁLISIS DNS",
                            "Obtener los registros NS.",
                            "Identificar los servidores DNS autoritativos.",
                            "Consultar los registros SOA.",
                            "Interpretar la información administrativa de la zona DNS.",
                            "Relacionar los proveedores DNS con la infraestructura del dominio.",

                            "FASE 5. IDENTIFICACIÓN DE SERVICIOS AUTORIZADOS",
                            "Consultar las políticas SPF.",
                            "Identificar servicios externos autorizados para el envío de correo.",
                            "Reconocer plataformas asociadas.",
                            "Interpretar las relaciones entre proveedores y el dominio analizado.",

                            "FASE 6. DESCUBRIMIENTO DE DIRECCIONES IP",
                            "Resolver entidades DNS hacia direcciones IPv4.",
                            "Identificar las direcciones IP asociadas.",
                            "Relacionar dominios, servidores e infraestructura de red.",
                            "Validar los resultados mediante consultas DNS adicionales.",

                            "FASE 7. IDENTIFICACIÓN DE NETBLOCKS",
                            "Seleccionar una dirección IP identificada.",
                            "Ejecutar transformaciones de Netblock.",
                            "Obtener el rango de direcciones relacionado.",
                            "Interpretar el esquema CIDR y el tamaño del bloque.",

                            "FASE 8. IDENTIFICACIÓN DE ASN",
                            "Seleccionar un Netblock.",
                            "Ejecutar transformaciones ASN.",
                            "Identificar el sistema autónomo asociado.",
                            "Relacionarlo con proveedores de infraestructura cloud.",
                            "Analizar el operador responsable de la red identificada.",

                            "FASE 9. ORGANIZACIÓN E INTERPRETACIÓN DEL GRAFO",
                            "Aplicar diseños jerárquicos y compactos.",
                            "Revisar las propiedades de los nodos.",
                            "Interpretar las relaciones entre entidades.",
                            "Construir una representación visual de la infraestructura digital identificada."),

                    "Se construyó un grafo de relaciones a partir del dominio tesla.com, identificando registros de correo, servidores DNS, direcciones IP, rangos de red y sistemas autónomos. La información obtenida permitió representar visualmente diferentes componentes de la infraestructura digital y sus relaciones.",

                    "El reconocimiento pasivo permite obtener información valiosa sobre una organización sin interactuar directamente con sus sistemas. Maltego facilita la visualización de relaciones entre dominios, DNS, IP, Netblocks y ASN mediante grafos interactivos. El análisis de registros DNS permite identificar servicios externos y proveedores de infraestructura. Finalmente, la correlación de direcciones IP, rangos de red y sistemas autónomos ayuda a comprender la arquitectura tecnológica de un objetivo y fortalece los procesos de investigación y evaluación de la superficie de exposición.",

                    List.of(
                            "/pdfs/Lab6.pdf"),

                    4),

            new Lab(
                    7L,
                    "Análisis e Interceptación de Tráfico Web con Burp Suite",
                    LocalDate.of(2026, 10, 30),
                    "Seguridad Web Ofensiva",
                    "Seguridad Web y Análisis de Exposición",
                    "Analizar el tráfico HTTP y HTTPS generado por diferentes aplicaciones web mediante Burp Suite, identificando solicitudes, respuestas, endpoints, parámetros y mecanismos de autenticación. Realizar pruebas controladas de interceptación y modificación de peticiones para comprender el intercambio de información entre el navegador y el servidor.",
                    List.of(
                            "Kali Linux",
                            "Burp Suite Community Edition",
                            "OWASP Juice Shop",
                            "PortSwigger Web Security Academy",
                            "Q10",
                            "SAC USTA"),
                    List.of(
                            "Interceptación de tráfico web HTTP y HTTPS",
                            "Análisis de protocolos y solicitudes HTTP",
                            "Identificación de endpoints y parámetros",
                            "Configuración y utilización de proxies",
                            "Uso del módulo Repeater de Burp Suite",
                            "Evaluación de mecanismos de autenticación",
                            "Análisis de respuestas de servidores web",
                            "Interpretación de estructuras JSON y form-urlencoded",
                            "Reconocimiento de vulnerabilidades relacionadas con OWASP Top 10"),
                    "El laboratorio se enfocó en el análisis de aplicaciones web utilizando Burp Suite como proxy de interceptación. Se estudiaron los mecanismos de comunicación entre navegadores y servidores, identificando métodos HTTP, endpoints, parámetros y estructuras de autenticación. Mediante entornos de práctica y pruebas autorizadas se capturaron y modificaron solicitudes para observar las respuestas de las aplicaciones.",
                    List.of(
                            "Comprender el funcionamiento de un proxy de interceptación.",
                            "Capturar y analizar tráfico HTTP y HTTPS.",
                            "Identificar endpoints utilizados por aplicaciones web.",
                            "Reconocer parámetros enviados durante los procesos de autenticación.",
                            "Modificar solicitudes en entornos controlados.",
                            "Utilizar Repeater para reenviar y comparar peticiones.",
                            "Analizar diferentes mecanismos de autenticación.",
                            "Identificar formatos de intercambio de información como JSON y form-urlencoded."),
                    List.of(
                            "Configurar Burp Suite Community Edition en Kali Linux mediante un proyecto temporal y los parámetros predeterminados.",
                            "Acceder al módulo Proxy y habilitar el navegador integrado de Burp Suite.",
                            "Estudiar los conceptos de proxy, endpoint, payload, Repeater, HTTP Request y HTTP Response.",
                            "Acceder a OWASP Juice Shop e interceptar solicitudes de autenticación utilizando Intercept ON.",
                            "Identificar y modificar parámetros de solicitudes de prueba, analizar las respuestas del servidor y reenviar peticiones mediante Repeater.",
                            "Observar los parámetros y estructuras de autenticación de Q10 en el contexto de las pruebas autorizadas.",
                            "Analizar las solicitudes del laboratorio de SQL Injection de PortSwigger Web Security Academy, identificando estructuras form-urlencoded y parámetros transmitidos.",
                            "Examinar el intercambio de información del proceso de autenticación de SAC USTA en el contexto autorizado de la práctica.",
                            "Comparar los métodos HTTP, endpoints, formatos de datos y respuestas obtenidas en los diferentes entornos analizados."),
                    "Se logró capturar e interpretar solicitudes y respuestas HTTP mediante Burp Suite, identificando endpoints, métodos, parámetros y estructuras utilizadas en los procesos de autenticación. También se utilizaron las herramientas Proxy y Repeater para modificar y reproducir solicitudes de prueba. La comparación permitió reconocer diferencias entre los formatos JSON, form-urlencoded y otros datos codificados.",
                    "El uso de Burp Suite permitió comprender cómo se comunican las aplicaciones web con sus servidores y cómo se puede analizar el tráfico generado durante una sesión. Se identificó que cada aplicación implementa mecanismos particulares para gestionar la autenticación y transmitir información. Además, el módulo Repeater facilitó la reproducción de solicitudes y el análisis de respuestas sin repetir todo el proceso de navegación. Finalmente, la práctica fortaleció los conocimientos sobre análisis de tráfico y reconocimiento de posibles vulnerabilidades web.",
                    List.of("/pdfs/Lab7.pdf"),
                    4),

            new Lab(
                    8L,
                    "Prompt Injection y Seguridad en Modelos de Inteligencia Artificial (LLM)",
                    LocalDate.of(2026, 11, 9),
                    "IA y Ciberseguridad",
                    "Seguridad en Inteligencia Artificial",
                    "Analizar los riesgos de seguridad asociados a los modelos de lenguaje mediante el estudio de técnicas de Prompt Injection, Jailbreak y manipulación de instrucciones. Evaluar las posibles fugas de información, alteraciones del comportamiento y vulnerabilidades en sistemas que integran inteligencia artificial generativa, considerando las recomendaciones de OWASP y los mecanismos de mitigación.",
                    List.of(
                            "OWASP Top 10 for LLMs 2025",
                            "MITRE ATLAS",
                            "Modelos de lenguaje (LLM)",
                            "Matrices de evaluación de riesgos",
                            "Sistemas RAG",
                            "Herramientas de análisis de seguridad en IA"),
                    List.of(
                            "Seguridad en sistemas de inteligencia artificial",
                            "Identificación de ataques Prompt Injection",
                            "Evaluación de riesgos en modelos LLM",
                            "Análisis de Prompt Injection directo e indirecto",
                            "Identificación de técnicas de Jailbreak",
                            "Evaluación de seguridad en sistemas RAG",
                            "Reconocimiento de ataques multimodales",
                            "Diseño de controles defensivos para modelos de lenguaje",
                            "Aplicación de recomendaciones OWASP para LLM",
                            "Evaluación de robustez y seguridad de sistemas de IA",
                            "Gobernanza y gestión de riesgos en inteligencia artificial"),
                    "El laboratorio abordó los riesgos emergentes de seguridad en aplicaciones basadas en Inteligencia Artificial Generativa, centrándose en la vulnerabilidad conocida como Prompt Injection. Se estudió cómo las instrucciones maliciosas pueden alterar el comportamiento esperado de un modelo, provocar exposición de información o influir en decisiones y funcionalidades. También se analizaron las recomendaciones de OWASP, las técnicas de Jailbreak y los mecanismos de protección aplicables a sistemas modernos que utilizan modelos de lenguaje.",
                    List.of(
                            "Comprender el concepto de Prompt Injection y su impacto en aplicaciones basadas en IA.",
                            "Analizar la relación entre Prompt Injection y vulnerabilidades tradicionales de seguridad.",
                            "Estudiar el riesgo LLM01: Prompt Injection del OWASP Top 10 for LLMs 2025.",
                            "Identificar patrones utilizados para manipular modelos de lenguaje.",
                            "Diferenciar entre Prompt Injection directo, indirecto, multimodal y ofuscado.",
                            "Comprender la relación entre Prompt Injection, Jailbreak y exposición del System Prompt.",
                            "Evaluar riesgos de seguridad en sistemas que integran modelos de lenguaje.",
                            "Reconocer controles defensivos para proteger aplicaciones basadas en IA."),
                    List.of(
                            "Estudiar los fundamentos del Prompt Injection y compararlo con ataques tradicionales como SQL Injection y XSS.",
                            "Analizar cómo las instrucciones maliciosas pueden modificar el comportamiento de un modelo de lenguaje.",
                            "Revisar la clasificación de riesgos de OWASP, incluyendo los riesgos relacionados con control de acceso, diseño seguro y configuración.",
                            "Estudiar el riesgo LLM01:2025 Prompt Injection y su impacto en sistemas de inteligencia artificial.",
                            "Identificar técnicas como override de instrucciones, escalada de privilegios, exfiltración de información, prompt chaining, ingeniería social y ofuscación.",
                            "Analizar las variantes de Prompt Injection directa e indirecta, incluyendo escenarios RAG, vectores multimodales y contenido externo.",
                            "Comparar Prompt Injection y Jailbreak, identificando sus diferencias y posibles impactos sobre las restricciones del modelo.",
                            "Estudiar estrategias defensivas como validación de entradas y salidas, separación de contexto, mínimo privilegio, supervisión humana y pruebas adversariales.",
                            "Construir matrices de evaluación para clasificar pruebas según su nivel de riesgo.",
                            "Interpretar indicadores de seguridad como ISR, DEL, MR, ACI y CRI para evaluar la robustez del sistema."),
                    "Se identificaron diferentes modalidades de Prompt Injection y sus posibles impactos sobre aplicaciones basadas en modelos de lenguaje. Se analizaron escenarios de manipulación de instrucciones, exposición de información y alteración del comportamiento del modelo. También se estudiaron controles de mitigación y métricas de evaluación como ISR, DEL, MR, ACI y CRI para valorar la resistencia de los sistemas frente a este tipo de amenazas.",
                    "El Prompt Injection representa una amenaza importante para los sistemas que utilizan inteligencia artificial generativa, debido a que puede aprovechar una separación insuficiente entre las instrucciones del sistema y el contenido externo. La práctica permitió comprender que estos ataques pueden llegar mediante mensajes directos, documentos, imágenes o información recuperada por sistemas RAG. Se concluyó que la protección de los modelos de lenguaje requiere controles técnicos, validación de entradas y salidas, supervisión humana y aplicación del principio de mínimo privilegio. La seguridad no depende únicamente del modelo, sino también de toda la infraestructura y los componentes que interactúan con él.",
                    List.of("/pdfs/Lab8.pdf"),
                    4),

            new Lab(
                    9L,
                    "Evaluación de Vulnerabilidades Web con DVWA (Damn Vulnerable Web Application)",
                    LocalDate.of(2026, 10, 18),
                    "Aplicaciones Web Vulnerables",
                    "Seguridad Web y Análisis de Exposición",
                    "Desarrollar pruebas de penetración web en un entorno controlado mediante DVWA, una aplicación diseñada para estudiar vulnerabilidades comunes en sistemas web. Configurar un laboratorio con Docker en Kali Linux y analizar diferentes técnicas de explotación, sus impactos sobre la seguridad y los mecanismos de mitigación relacionados con el OWASP Top 10.",
                    List.of(
                            "Kali Linux",
                            "DVWA (Damn Vulnerable Web Application)",
                            "Docker",
                            "Firefox",
                            "PHP",
                            "MySQL"),
                    List.of(
                            "Configuración de entornos controlados de pentesting web",
                            "Evaluación de vulnerabilidades mediante OWASP Top 10",
                            "Identificación de autenticación débil y ataques de fuerza bruta",
                            "Análisis de SQL Injection",
                            "Evaluación de SQL Injection Blind",
                            "Identificación de Cross-Site Scripting (XSS)",
                            "Análisis de Cross-Site Request Forgery (CSRF)",
                            "Evaluación de Command Injection",
                            "Análisis de File Upload vulnerable",
                            "Identificación de Local File Inclusion (LFI)",
                            "Análisis de mecanismos de validación y sanitización",
                            "Aplicación de controles de mitigación y desarrollo seguro"),
                    "Este laboratorio integró dos sesiones prácticas utilizando DVWA (Damn Vulnerable Web Application), una plataforma diseñada para el aprendizaje de pruebas de penetración y análisis de vulnerabilidades web. Se configuró un entorno de pruebas mediante Docker en Kali Linux y se estudiaron diferentes categorías de vulnerabilidades relacionadas con el OWASP Top 10. La práctica permitió comprender los mecanismos de explotación en ambientes controlados, identificar configuraciones inseguras y analizar estrategias de mitigación aplicables al desarrollo seguro de aplicaciones.",
                    List.of(
                            "Implementar un entorno seguro de pruebas utilizando DVWA y Docker.",
                            "Comprender las vulnerabilidades más comunes presentes en aplicaciones web.",
                            "Analizar escenarios relacionados con el OWASP Top 10.",
                            "Identificar el impacto de configuraciones inseguras en aplicaciones web.",
                            "Comprender técnicas de explotación controlada utilizadas en pruebas de penetración.",
                            "Evaluar mecanismos de mitigación orientados al desarrollo seguro.",
                            "Comprender el ciclo de detección, explotación controlada y remediación de vulnerabilidades."),
                    List.of(
                            "Actualizar los paquetes de Kali Linux e instalar y configurar Docker.",
                            "Desplegar el contenedor de DVWA y acceder a la aplicación mediante el navegador.",
                            "Inicializar la base de datos y configurar el nivel de seguridad Low para las prácticas educativas.",
                            "Analizar el módulo Brute Force para estudiar la autenticación débil y la ausencia de limitación de intentos.",
                            "Realizar pruebas controladas de SQL Injection mediante la modificación de parámetros y el análisis de consultas vulnerables.",
                            "Estudiar Command Injection mediante parámetros de entrada y observar los riesgos asociados a la ejecución de comandos en el servidor.",
                            "Evaluar XSS Reflected y XSS Stored, identificando la ejecución de scripts y los problemas de sanitización de entradas.",
                            "Analizar CSRF mediante solicitudes controladas relacionadas con el cambio de contraseña y la ausencia de tokens de protección.",
                            "Examinar la funcionalidad File Upload para comprender los riesgos de permitir archivos sin validaciones adecuadas.",
                            "Estudiar Local File Inclusion (LFI) mediante la manipulación controlada de parámetros de rutas y la identificación de exposición de archivos.",
                            "Evaluar SQL Injection Blind mediante respuestas TRUE/FALSE e inferencia de información.",
                            "Relacionar las vulnerabilidades estudiadas con sus posibles impactos y documentar medidas de mitigación."),
                    "Se configuró un entorno de pruebas funcional con DVWA y Docker en Kali Linux. Se estudiaron vulnerabilidades como Brute Force, SQL Injection, Command Injection, XSS Reflected, XSS Stored, CSRF, File Upload, Local File Inclusion y SQL Injection Blind. Las pruebas permitieron observar cómo las validaciones insuficientes y las configuraciones inseguras pueden afectar la confidencialidad, integridad y disponibilidad de una aplicación web.",
                    "DVWA permitió estudiar de manera práctica diferentes vulnerabilidades presentes en aplicaciones web dentro de un entorno controlado. Las pruebas demostraron que una validación insuficiente de entradas, una gestión inadecuada de sesiones y la ausencia de controles de seguridad pueden comprometer los sistemas. Se comprendió la importancia de implementar consultas parametrizadas, sanitización de datos, validación de archivos, protección contra CSRF y el principio de mínimo privilegio. Finalmente, el laboratorio permitió relacionar la detección y evaluación de vulnerabilidades con las estrategias de remediación necesarias para desarrollar aplicaciones web más seguras.",
                    List.of("/pdfs/Lab9.pdf","/pdfs/Lab10.pdf"),
                    8),

            new Lab(
                    10L,
                    "Análisis Automatizado de Seguridad Web con OWASP ZAP (Zed Attack Proxy)",
                    LocalDate.of(2026, 11, 14),
                    "Pentesting Web Automatizado",
                    "Seguridad Web y Análisis de Exposición",
                    "Evaluar la seguridad de aplicaciones web mediante OWASP ZAP, utilizando sus herramientas de interceptación, reconocimiento y escaneo automatizado para identificar vulnerabilidades y configuraciones inseguras. La práctica se desarrolló principalmente sobre DVWA en un entorno controlado con Docker y Kali Linux, complementándose con otros sitios autorizados de prueba.",
                    List.of(
                            "OWASP ZAP",
                            "DVWA",
                            "Kali Linux",
                            "Docker",
                            "Firefox",
                            "Proxy HTTP/HTTPS"),
                    List.of(
                            "Evaluación automatizada de vulnerabilidades web",
                            "Análisis de tráfico HTTP y HTTPS",
                            "Configuración de proxies de interceptación",
                            "Reconocimiento automatizado de aplicaciones web",
                            "Uso de Spider y AJAX Spider",
                            "Interpretación de alertas de seguridad",
                            "Ejecución de escaneos activos",
                            "Análisis de cookies y sesiones HTTP",
                            "Evaluación de comunicaciones WebSockets",
                            "Identificación de configuraciones inseguras",
                            "Generación e interpretación de reportes de seguridad",
                            "Aplicación de conceptos del OWASP Top 10"),
                    "El laboratorio tuvo como propósito utilizar OWASP ZAP (Zed Attack Proxy) como herramienta de análisis automatizado de seguridad en aplicaciones web. Se realizaron pruebas sobre DVWA, previamente configurado en Docker, y otros entornos autorizados. Durante la práctica se analizaron solicitudes HTTP y HTTPS, configuraciones inseguras, mecanismos de autenticación y diferentes categorías de vulnerabilidades. También se utilizaron herramientas de reconocimiento automatizado y escaneo activo para comprender el proceso de evaluación de seguridad web.",
                    List.of(
                            "Comprender el funcionamiento de OWASP ZAP como plataforma de análisis de seguridad web.",
                            "Configurar un proxy de interceptación en el navegador.",
                            "Capturar y analizar tráfico HTTP y HTTPS.",
                            "Identificar configuraciones inseguras y vulnerabilidades comunes.",
                            "Utilizar Spider y AJAX Spider para descubrir recursos y rutas.",
                            "Comprender el funcionamiento de los escaneos activos.",
                            "Analizar sesiones HTTP y mecanismos de autenticación.",
                            "Generar reportes automatizados de hallazgos de seguridad."),
                    List.of(
                            "Verificar la instalación de OWASP ZAP en Kali Linux, instalarlo desde los repositorios cuando sea necesario y comprobar su versión.",
                            "Ejecutar el contenedor DVWA mediante Docker y validar el acceso a la aplicación desde el navegador.",
                            "Configurar Firefox para utilizar el proxy local de OWASP ZAP.",
                            "Capturar el tráfico generado por la aplicación y analizar solicitudes GET y POST, códigos de respuesta, errores y redirecciones.",
                            "Revisar la sección Alerts para identificar posibles problemas como ausencia de Content Security Policy, cookies sin atributos HttpOnly o SameSite, falta de protección Anti-Clickjacking y exposición de información del servidor.",
                            "Ejecutar el módulo Spider para descubrir rutas, directorios y recursos accesibles, construyendo automáticamente el mapa del sitio.",
                            "Realizar un Active Scan en el entorno de pruebas para evaluar posibles vulnerabilidades como SQL Injection, XSS y problemas de validación de entradas.",
                            "Analizar las cookies de sesión, incluyendo PHPSESSID, y estudiar los riesgos relacionados con la gestión de sesiones.",
                            "Utilizar AJAX Spider para descubrir recursos dinámicos mediante navegación automatizada y ejecución de JavaScript.",
                            "Examinar los canales WebSockets y analizar los mensajes enviados y recibidos durante la comunicación en tiempo real.",
                            "Realizar pruebas adicionales sobre otros entornos autorizados y generar el reporte final de hallazgos de seguridad."),
                    "Se configuró OWASP ZAP como proxy de interceptación y se analizó el tráfico generado por DVWA y otros entornos de prueba autorizados. La herramienta permitió identificar configuraciones inseguras relacionadas con cabeceras HTTP, cookies y exposición de información del servidor. Mediante Spider se descubrieron más de 90 URL, incluyendo rutas como /dvwa, /login.php, /robots.txt, /images y /css. También se estudiaron las funcionalidades Active Scan, AJAX Spider y WebSockets, además de los mecanismos de gestión de sesiones y generación de reportes.",
                    "OWASP ZAP permitió comprender la importancia de automatizar los procesos de reconocimiento y evaluación de seguridad en aplicaciones web. Las alertas facilitaron la identificación de configuraciones inseguras relacionadas con cookies, cabeceras HTTP y mecanismos de protección. Asimismo, Spider y AJAX Spider demostraron su utilidad para descubrir recursos y construir mapas de aplicaciones antes de realizar evaluaciones más profundas. El Active Scan permitió estudiar cómo se identifican vulnerabilidades comunes de manera automatizada. Finalmente, se concluyó que estas herramientas complementan las pruebas manuales y facilitan la documentación de hallazgos para mejorar la seguridad de las aplicaciones web.",
                    List.of("/pdfs/Lab11.pdf"),
                    4)

    );

    public List<Domain> getDomains() {
        return domains;
    }

    public List<Lab> getLabs() {
        return labs;
    }

    public Optional<Lab> findLab(Long id) {
        return labs.stream()
                .filter(l -> l.id().equals(id))
                .findFirst();
    }

    public int totalHours() {
        return labs.stream()
                .mapToInt(Lab::hours)
                .sum();
    }

    public long totalCompetencies() {
        return labs.stream()
                .flatMap(l -> l.competencies().stream())
                .distinct()
                .count();
    }

    public long countByDomain(String domain) {
        return labs.stream()
                .filter(l -> l.domain().equals(domain))
                .count();
    }
}
