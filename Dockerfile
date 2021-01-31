# base image
FROM gradle:jre15-hotspot

WORKDIR /home/app
COPY . .

RUN gradle build --no-daemon

EXPOSE 80
CMD ["java", "-jar", "-Dserver.port=80", "./build/libs/app.jar"]
#CMD ["java", "-jar", "./build/libs/app.jar"]
