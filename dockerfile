FROM openjdk:17-jdk-alpine

COPY target/docker-app-0.0.1-SNAPSHOT.jar docker-app-0.0.1-SNAPSHOT.jar 

ENTRYPOINT [ "java","-jar","/docker-app-0.0.1-SNAPSHOT.jar"]
