FROM openjdk:26-ea-trixie
ADD demo/target/demo-0.0.1-SNAPSHOT.jar /usr/share/app.jar
ENTRYPOINT ["java", "-jar", "/usr/share/app.jar"]