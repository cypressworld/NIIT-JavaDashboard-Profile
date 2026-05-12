
# Stage 1: Build the application
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Run the application
FROM eclipse-temurin:21-jre
WORKDIR /app
# This copies the JAR we built in Stage 1
COPY --from=build /app/target/app.jar app.jar

# This command bypasses the Manifest entirely!
ENTRYPOINT ["java", "-jar", "app.jar"]
