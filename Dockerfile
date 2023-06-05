# Usa una imagen base de Java para construir la imagen de Docker
FROM openjdk:11-jdk-slim

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /src

# Copia el archivo JAR de tu aplicación al contenedor
COPY target/nombre-del-proyecto.jar app.jar

# Expone el puerto en el que se ejecuta tu API dentro del contenedor
EXPOSE 8080

# Comando para ejecutar tu aplicación cuando se inicie el contenedor
CMD ["java", "-jar", "app.jar"]