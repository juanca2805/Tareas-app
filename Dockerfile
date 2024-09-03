# Usar una imagen base de Java
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo JAR generado por Gradle al contenedor
COPY build/libs/tareas-app-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto que usará Spring Boot
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
