FROM adoptopenjdk/openjdk14:alpine-slim
COPY target/eks-kinesis-example.jar eks-kinesis-example.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar", "eks-kinesis-example.jar"]