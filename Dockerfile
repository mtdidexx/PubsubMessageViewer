FROM openjdk:14-alpine
COPY build/libs/PubsubMessageViewer-*-all.jar PubsubMessageViewer.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "PubsubMessageViewer.jar"]