# base image
FROM gradle:jre15-hotspot

WORKDIR /home/app
#COPY ./build.gradle .
#COPY ./settings.gradle .

#RUN gradle clean build --no-daemon > /dev/null 2>&1 || true

COPY ./build/libs/app.jar .
#RUN gradle assemble --no-daemon

EXPOSE 80
#CMD ["java", "-jar", "-Dserver.port=80", "./build/libs/app.jar"]
CMD ["java", "-jar", "-Dserver.port=80", "app.jar"]
