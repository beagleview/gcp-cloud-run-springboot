FROM adoptopenjdk/openjdk11:alpine-jre
VOLUME /tmp

# Make port 8080 available to the world outside container
EXPOSE 8080

# Set application's JAR file
ARG JAR_FILE=target/gcp-cloudrun-0.0.2.jar

# Add the application's JAR file to the container
ADD ${JAR_FILE} app.jar

# Run the JAR file
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]
