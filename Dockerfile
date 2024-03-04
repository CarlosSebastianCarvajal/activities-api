FROM amazoncorrecto:17-alpine-jdk

WORKDIR /app 

COPY target/activities-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]