FROM openjdk:11

ADD ./target/Zulimpl-0.0.1-SNAPSHOT.jar /usr/src/Zulimpl-0.0.1-SNAPSHOT.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "Zulimpl-0.0.1-SNAPSHOT.jar"]