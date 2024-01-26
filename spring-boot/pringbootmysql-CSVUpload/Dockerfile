FROM openjdk:11
VOLUME /opt
EXPOSE 8080
ARG JAR_FILE=target/springbootmysql-0.0.1.war
ADD ${JAR_FILE} /opt/springbootmysql-0.0.1.war
ENTRYPOINT ["java","-jar","/opt/springbootmysql-0.0.1.war"]