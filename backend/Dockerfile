# Use Maven to build the project inside the container
FROM maven:3.8.6-openjdk-17 AS build
WORKDIR /app

# Copy the source code into the container
COPY . .

# Build the JAR file
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
