Clínica Veterinaria - API
Este proyecto es una API REST desarrollada para una clínica veterinaria 
utilizando Java con Spring Boot, JPA, Hibernate y H2 como base de datos en 
memoria. El sistema permite la gestión de mascotas y sus dueños, 
ofreciendo funcionalidades CRUD completas y consultas específicas.

Funcionalidades
CRUD de Mascotas: Permite agregar, actualizar, eliminar y obtener 
información sobre mascotas.
CRUD de Dueños: Permite agregar, actualizar, eliminar y obtener 
información sobre los dueños de las mascotas.
Consulta de Mascotas: Obtén un listado de todas las mascotas de especie 
"perro" y raza "caniche".
Consulta de Mascota y Dueño: Obtén una lista de datos combinados de una 
mascota y su dueño, incluyendo:
nombre de la mascota
especie
raza
nombre del dueño
apellido del dueño
Tecnologías Utilizadas
Java: Lenguaje principal para la lógica del backend.
Spring Boot: Framework utilizado para construir la API REST.
JPA & Hibernate: Herramientas para el mapeo objeto-relacional y la 
interacción con la base de datos.
H2 Database: Base de datos en memoria utilizada durante el desarrollo y 
pruebas.
Docker: Contenedor para facilitar la ejecución y despliegue del proyecto.
Instalación
Prerrequisitos
Tener Docker instalado en tu máquina.
Tener Java JDK 11 o superior instalado.
Pasos
Clonar el repositorio:
bash
Copiar código
git clone https://github.com/usuario/clinica-veterinaria-api.git
Navegar a la carpeta del proyecto:
bash
Copiar código
cd clinica-veterinaria-api
Ejecutar el contenedor Docker:
bash
Copiar código
docker run -d -p 8080:8080 nombre-usuario/clinica-veterinaria-api:latest
Base de Datos
La API utiliza H2 como base de datos en memoria. Los datos se restablecen 
cada vez que el sistema se reinicia. Puedes acceder al panel de 
administración de H2 a través de la siguiente URL cuando la aplicación 
esté en ejecución:

bash
Copiar código
http://localhost:8080/h2-console
Colecciones de Postman
Se incluyen colecciones de Postman para facilitar las pruebas de la API. 
Estas colecciones están disponibles en el directorio /postman-collections 
del proyecto.

Uso
Endpoints Principales
Mascotas

GET /api/mascotas: Listar todas las mascotas.
POST /api/mascotas: Crear una nueva mascota.
PUT /api/mascotas/{id}: Actualizar una mascota existente.
DELETE /api/mascotas/{id}: Eliminar una mascota.
Dueños

GET /api/duenos: Listar todos los dueños.
POST /api/duenos: Crear un nuevo dueño.
PUT /api/duenos/{id}: Actualizar un dueño existente.
DELETE /api/duenos/{id}: Eliminar un dueño.
Consultas Específicas

GET /api/mascotas/perro/caniche: Obtener todas las mascotas que sean 
perros de raza caniche.
GET /api/mascotas/dueno/detalle: Obtener un listado de mascotas junto con 
los datos de sus dueños.
Imágenes Docker
La imagen de Docker para este proyecto está disponible en Docker Hub y 
puede ser ejecutada usando el siguiente comando:

bash
Copiar código
docker pull nombre-usuario/clinica-veterinaria-api:latest
Notas
Este proyecto sigue el camino feliz sin validaciones exhaustivas ni manejo 
de errores avanzados.
Este proyecto está pensado para futuras integraciones con aplicaciones web 
y móviles que puedan consultar al mismo backend.

