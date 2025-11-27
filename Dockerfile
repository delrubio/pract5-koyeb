FROM openjdk:26-ea-trixie
COPY conf/nginx /etc/nginx
COPY demo/src/main/resources/templates /usr/share/nginx
ENTRYPOINT ["java", "-jar", "/usr/share/app.jar"]