FROM openjdk:18-jdk-alpine
ADD target/kube-section40.jar kube-section40.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/kube-section40.jar"]