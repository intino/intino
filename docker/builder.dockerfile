FROM openjdk:21-jdk-slim
LABEL maintainer="octavio.roncal <octavioroncal@siani.es>"
LABEL version="1.3.0"
LABEL description="Tara compiler"
LABEL operations="Build"
LABEL targets="Java"
COPY out/build/builder/builder.jar /root/app/
COPY out/build/builder/lib /root/app/lib
COPY docker/run-builder.sh /root/app/
WORKDIR /root/app
RUN chmod +x /root/app/run-builder.sh
ENTRYPOINT ["/root/app/run-builder.sh"]