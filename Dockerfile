FROM openjdk:26-ea-trixie
ADD demo/target/demo-0.0.1-SNAPSHOT.jar /usr/share/app.jar
COPY conf/nginx /etc/nginx
COPY demo/src/main/resources/templates /usr/share/nginx
ENTRYPOINT ["java", "-jar", "/usr/share/app.jar"]