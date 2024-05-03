FROM amazoncorretto:17.0.11

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} gateway_service.jar

ENTRYPOINT ["java", "-jar", "/gateway_service.jar"]

EXPOSE 9090