FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG DEPENDENCY=target
#COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
#COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/hello-catalin-0.0.2-SNAPSHOT.jar app/lib/hello-catalin-0.0.2-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","app/lib/hello-catalin-0.0.2-SNAPSHOT.jar"]
