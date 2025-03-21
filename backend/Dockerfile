# Use Maven to build the project inside the container
FROM maven:3.8.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copy the pom.xml and download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the source code and build the JAR file
COPY src ./src
RUN mvn clean package -DskipTests

# Use a smaller JDK image for running the app
FROM openjdk:17
WORKDIR /app

# Copy the built JAR file from the previous stage
COPY --from=build /app/target/*.jar app.jar

# Expose the port your Spring Boot app runs on
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]
