# VeterinaryClinicProjectBackJava
Clínica Veterinaria - API
Este proyecto es una API REST desarrollada para una clínica veterinaria utilizando Java con Spring Boot, JPA, Hibernate y H2 como base de datos en memoria. El sistema permite la gestión de mascotas y sus dueños, 
ofreciendo funcionalidades CRUD completas y consultas específicas.

Funcionalidades
CRUD de Mascotas: Permite agregar, actualizar, eliminar y obtener información sobre mascotas.
CRUD de Dueños: Permite agregar, actualizar, eliminar y obtener  información sobre los dueños de las mascotas.
Consulta de Mascotas: Obtén un listado de todas las mascotas de especie "perro" y raza "caniche".
Consulta de Mascota y Dueño: Obtén una lista de datos combinados de una  mascota y su dueño, incluyendo:
nombre de la mascota
especie
raza
nombre del dueño
apellido del dueño

Este proyecto sigue el camino feliz sin validaciones exhaustivas ni manejo de errores avanzados.
Este proyecto está pensado para futuras integraciones con aplicaciones web y móviles que puedan consultar al mismo backend.

La API utiliza H2 como base de datos en memoria. Los datos se restablecen 
cada vez que el sistema se reinicia.

Colecciones de Postman
Se incluyen colecciones de Postman para facilitar las pruebas de la API. 
Estas colecciones están disponibles en el directorio /postman del proyecto.

Tecnologías Utilizadas
Java: Lenguaje principal para la lógica del backend.
Spring Boot: Framework utilizado para construir la API REST.
JPA & Hibernate: Herramientas para el mapeo objeto-relacional y la 
interacción con la base de datos.
H2 Database: Base de datos en memoria utilizada durante el desarrollo y 
pruebas.
Docker: Contenedor para facilitar la ejecución y despliegue del proyecto.
Postman: En la carpeta postman ec¿ncontrarás la colection para probar los diferentes endpoints. 
