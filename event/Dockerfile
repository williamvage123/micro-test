# Use a lighter base image
FROM openjdk:21-jdk-slim

# Set the working directory
WORKDIR /src/event/

# Copy the JAR file into the container
COPY ./target/event-0.0.1-SNAPSHOT.jar .

# Expose the application port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "event-0.0.1-SNAPSHOT.jar"]
