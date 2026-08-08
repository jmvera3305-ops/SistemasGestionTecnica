Sistema de Gestión Técnica (HelpDesk) - Actividad 8



Backend y API REST desarrollado con \*\*Spring Boot\*\* y \*\*PostgreSQL\*\* para la gestión de tickets e incidentes técnicos.



\---



Tecnologías y Dependencias



\- \*\*Lenguaje:\*\* Java (JDK 17/21)

\- \*\*Framework:\*\* Spring Boot 4.1.0

\- \*\*Gestor de Dependencias:\*\* Maven

\- \*\*Base de Datos:\*\* PostgreSQL

\- \*\*Dependencias clave (`pom.xml`):\*\*

&#x20; - `Spring Web`: Creación de controladores REST y servidor Tomcat embebido.

&#x20; - `Spring Data JPA`: Abstracción ORM con Hibernate para persistencia.

&#x20; - `PostgreSQL Driver`: Controlador JDBC de conexión a PostgreSQL.



\---



Configuración de la Base de Datos



1\. Crear la base de datos en \*\*pgAdmin\*\* o PostgreSQL:

&#x20;  ```sql

&#x20;  CREATE DATABASE helpdesk\_db;

