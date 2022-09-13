FROM maven:3.8.4-openjdk-17-slim as maven
COPY pom.xml ./pom.xml
COPY src ./src
RUN mvn clean package spring-boot:repackage

FROM openjdk:17.0.2-slim-buster
COPY --from=maven target/api-*.jar ./api.jar
CMD ["java", "-jar", "api.jar"]


