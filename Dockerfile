FROM openjdk:17-alpine
EXPOSE 8082
COPY build/libs/movies-backend-0.0.1-SNAPSHOT.jar app/movies-backend-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","app/movies-backend-0.0.1-SNAPSHOT.jar"]