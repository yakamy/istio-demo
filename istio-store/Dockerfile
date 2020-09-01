FROM openjdk:8-jdk
LABEL maintainer="yakamy"

ARG JAR_FILE
ARG APP_NAME

ENV JVM_OPTS="-Xms512m -Xmx1024m"
ENTRYPOINT [ "sh", "-c" ,"java -jar ${JVM_OPTS} /app.jar" ]
EXPOSE 8080
EXPOSE 80
#WORKDIR ${AGENT_HOME}

RUN echo "Asia/Shanghai" > /etc/timezone && \
    echo "add ${JAR_FILE}" && \
    mkdir /opt/log && \
    ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
ADD target/${JAR_FILE} /app.jar