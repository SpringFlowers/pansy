FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD ../target/pansy-0.0.1-SNAPSHOT.jar pansy.jar
#RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/pansy.jar"]
EXPOSE 5110