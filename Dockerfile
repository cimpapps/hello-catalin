FROM zenika/alpine-maven
VOLUME /tmp
#COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
#COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY . .
RUN mvn clean install -DskipTests
ENTRYPOINT ["java","-jar","target/hello-catalin-0.0.2-SNAPSHOT.jar"]
