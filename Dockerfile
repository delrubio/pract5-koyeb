FROM openjdk:26-ea-trixie
COPY conf/nginx /etc/nginx
ENTRYPOINT ["java", "-jar", "/usr/share/app.jar"]