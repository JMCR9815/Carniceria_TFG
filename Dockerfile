# Usa una imagen base de Java para construir la imagen de Docker
FROM openjdk:17

# Copia el archivo JAR de tu aplicación al contenedor
COPY target/Carneceria_TFG.jar Carniceria_TFG.jar

# Comando para ejecutar tu aplicación cuando se inicie el contenedor
CMD ["java", "-jar", "/Carniceria_TFG.jar"]