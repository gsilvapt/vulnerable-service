FROM gradle:jdk17

WORKDIR /usr/src/app
COPY . /usr/src/app
RUN ./gradlew clean build
EXPOSE 8080

ENTRYPOINT ["./gradlew", "bootRun"]
