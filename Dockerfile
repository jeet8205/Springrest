FROM tomcat:8.5.73-jdk11-temurin

RUN rm -rf /usr/local/tomcat/webapps/*

COPY ./target/spring-boot-starter-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

CMD ["catalina.sh","run"]

EXPOSE 8080