FROM openjdk:17-alpine
EXPOSE 8085
VOLUME /tmp
COPY target/demoConnector-0.0.1-SNAPSHOT.jar userConnector.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/userConnector.jar"]