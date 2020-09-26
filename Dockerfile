FROM adoptopenjdk/openjdk11:latest
LABEL key="luket"
VOLUME /tmp
EXPOSE 8080
COPY target/HomeMade-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java","-jar", "/HomeMade-0.0.1-SNAPSHOT.jar"]
CMD ["-start"]

