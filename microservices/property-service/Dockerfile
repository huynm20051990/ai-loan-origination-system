FROM eclipse-temurin:21-jre
WORKDIR application
ADD ./build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
