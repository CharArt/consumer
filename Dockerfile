FROM maven:3.8.5-openjdk-21
COPY /src /src
COPY pom.xml
RUN mvn -f /pom.xml clean package

FROM openjdk:21-jdk-slim
COPY --from=build /target/*.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "app.jar"]