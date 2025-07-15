# Use Maven with JDK 21 to build the project
FROM maven:3.9.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Use JDK 21 in final image to match the build environment
FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app

# Copy only the final built JAR from build stage
COPY --from=build /app/target/*.jar springbootfirst.jar

# Expose the application port
EXPOSE 8080

# Set entrypoint to run the JAR
ENTRYPOINT ["java", "-jar", "springbootfirst.jar"]
