FROM openjdk:8
#RUN apt-get update
#RUN apt-get install -y maven

COPY src /usr/app/src
COPY .metadata /usr/app/.metadata
COPY .classpath /usr/app/.classpath
COPY target /usr/app/target
COPY pom.xml /usr/app
WORKDIR /usr/app
RUN export CLASSPATH=.:/usr/app/target/
EXPOSE 8080
CMD ["java", "-jar","target/client-jar-with-dependencies.jar"]