FROM openjdk:8-jre
MAINTAINER vicky.mkce@gmail.com
LABEL Description="simple couch base spring boot image"

#Copy built jar to deployment folder
COPY ./build/libs/*.jar /deployment/

#RUNTIME_ENV is an environment variable that will be in each environment setup dev,test,prod
CMD ["/bin/sh", "java -jar /deployment/stats-ai*.jar -Dspring.profiles.active=${RUNTIME_ENV}"]