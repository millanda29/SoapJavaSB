# 🎬 Movie API SOAP Service

Este proyecto implementa un servicio SOAP que permite gestionar una lista de películas, permitiendo operaciones de **obtener**, **agregar**, **actualizar** y **eliminar** películas. Además, se proporciona una interfaz de usuario (UI) usando **Thymeleaf** para interactuar con el servicio.

## 🚀 Funcionalidades

El servicio SOAP permite realizar las siguientes operaciones:

1. **Obtener todas las películas**: Recupera una lista de todas las películas disponibles.
2. **Obtener película por ID**: Permite obtener detalles de una película específica usando su ID.
3. **Agregar película**: Permite añadir una nueva película a la lista.
4. **Actualizar película**: Permite actualizar los detalles de una película existente.
5. **Eliminar película**: Permite eliminar una película por su ID.

Además, se ha desarrollado una interfaz web para interactuar con el servicio SOAP y realizar las operaciones mencionadas de manera visual y amigable.

## 🛠 Requisitos

- **JDK 11 o superior**: El proyecto está construido con Java, por lo que necesitarás tener instalada una versión compatible del JDK.
- **Spring Boot**: Usado para crear y ejecutar el servicio SOAP.
- **Maven**: Usado para la gestión de dependencias y construcción del proyecto.
- **Thymeleaf**: Motor de plantillas utilizado para renderizar las vistas HTML.

## 📂 Estructura del Proyecto

```
SoapJavaSB/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── movieapi/
│   │   │           ├── config/
│   │   │           │   └── WebServiceConfig.java  # Configuración del servicio SOAP
│   │   │           └── controller/
│   │   │               └── MovieController.java   # Lógica de negocio para manejar las solicitudes
│   │   ├── resources/
│   │   │   ├── xsd/
│   │   │   │   └── movies.xsd                    # Esquema XSD para validación de datos
│   │   │   ├── templates/
│   │   │   │   ├── index.html                    # Vista para el listado de películas
│   │   │   │   └── update-movie.html             # Vista para la actualización de películas
│   │   │   └── application.properties            # Configuración de la aplicación
├── pom.xml                                       # Configuración de dependencias de Maven
```

## ⚙️ Configuración del Proyecto

### 1. Clonar el Proyecto

```bash
git clone https://github.com/millanda29/SoapJavaSB.git
cd SoapJavaSB
```

### 2. Instalar Dependencias

Este proyecto usa **Maven** para gestionar las dependencias. Si no tienes Maven instalado, puedes seguir [estas instrucciones](https://maven.apache.org/install.html).

Una vez instalado Maven, ejecuta el siguiente comando para descargar todas las dependencias:

```bash
mvn clean install
```

### 3. Ejecutar el Proyecto

Para ejecutar el proyecto, usa el siguiente comando:

```bash
mvn spring-boot:run
```

El servicio estará disponible en `http://localhost:8080/ws`, y podrás acceder a la interfaz de usuario en `http://localhost:8080/`.

## 🌐 Interfaz de Usuario

### 1. Listado de Películas

- Se muestra una tabla con todas las películas.
- Puedes agregar nuevas películas a través de un formulario.
- Cada película tiene enlaces para **Actualizar** y **Eliminar**.

### 2. Agregar Película

Formulario simple que permite ingresar el **nombre**, **director** y **año** de una nueva película.

### 3. Actualizar Película

Permite actualizar los detalles de una película existente. Solo necesitas ingresar los nuevos datos y hacer clic en **Actualizar**.

### 4. Eliminar Película

El enlace **Eliminar** permite borrar una película de la base de datos.

## 🧪 Pruebas

Puedes probar las operaciones SOAP directamente a través de herramientas como **SoapUI** o **Postman**. Aquí hay un ejemplo de cómo realizar una solicitud para obtener todas las películas:

**GET** `http://localhost:8080/ws/movies`

Si prefieres probar el servicio SOAP manualmente, puedes usar los endpoints SOAP disponibles en el archivo WSDL:

```bash
http://localhost:8080/ws/movies.wsdl
```

## 💻 Tecnologías Usadas

- **Java 11+**: Lenguaje de programación utilizado.
- **Spring Boot**: Framework para construir la aplicación.
- **Spring Web Services**: Para exponer y consumir servicios SOAP.
- **Thymeleaf**: Motor de plantillas para la interfaz de usuario.
- **Maven**: Herramienta de gestión de dependencias y construcción.

## 🔄 Contribuciones

Si deseas contribuir a este proyecto, puedes seguir los siguientes pasos:

1. Haz un fork de este repositorio.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza tus cambios y haz commit (`git commit -am 'Añadir nueva funcionalidad'`).
4. Sube tus cambios (`git push origin feature/nueva-funcionalidad`).
5. Abre un Pull Request.

## 📜 Licencia

Este proyecto está bajo la Licencia MIT. Para más detalles, revisa el archivo [LICENSE](LICENSE).

¡Gracias por usar el **Movie API SOAP Service**! 🎬