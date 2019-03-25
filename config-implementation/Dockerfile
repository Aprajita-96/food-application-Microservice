FROM openjdk:11

ADD ./target/config-implementation-0.0.1-SNAPSHOT.jar /usr/src/config-implementation-0.0.1-SNAPSHOT.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "config-implementation-0.0.1-SNAPSHOT.jar"]