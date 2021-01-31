# base image
FROM gradle:jre15-hotspot

WORKDIR /home/app
COPY . .

RUN gradle build --no-daemon

EXPOSE 8080
CMD ["java", "-jar", "./build/libs/app.jar"]
