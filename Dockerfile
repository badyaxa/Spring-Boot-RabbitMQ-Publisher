FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} publisher.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/publisher.jar"]
