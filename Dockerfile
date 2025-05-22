# Etapa de dependencias
FROM eclipse-temurin:21-jdk-jammy AS deps
WORKDIR /build
COPY mvnw mvnw
RUN chmod 0755 mvnw
COPY .mvn .mvn
COPY pom.xml .
RUN ./mvnw dependency:go-offline -B

# Etapa de compilación
FROM eclipse-temurin:21-jdk-jammy AS build
WORKDIR /app
COPY --from=deps /build /app
COPY src src
RUN ./mvnw package -DskipTests

# Etapa final
FROM eclipse-temurin:21-jdk-jammy
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
