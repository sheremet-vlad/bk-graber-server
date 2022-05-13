FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:8-jdk
MAINTAINER vladSheremet.com
COPY --from=build /home/app/target/api-1.0.jar api.jar
ENTRYPOINT ["java","-jar","/api.jar"]

USER root
RUN mkdir /home/bkGraberServer
RUN mkdir /home/bkGraberServer/logs
RUN chmod -R 777 home/