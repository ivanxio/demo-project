FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER jpacheco@autentia.com
ADD demo-project-controller-0.0.1-SNAPSHOT.jar demo-project-controller-0.0.1.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]