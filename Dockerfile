FROM openjdk:14-alpine
COPY build/libs/test-app-*-all.jar test-app.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "test-app.jar"]