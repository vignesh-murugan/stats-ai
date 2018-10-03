# Stats AI API

This project get the AI analyzed stats data from couchbase and publish it thru springboot api.

#### Technologies Used:
* springboot rest data
* springboot data couchbase
* Couchbase DB
* Docker and docker-compose

### Local set-up

#### Couchbase set-up

Use couchbase docker image to start the couchbase DB. Official Docker image for couchbase is [Docker Couchbase repo](https://hub.docker.com/_/couchbase/)

1. `docker login` - login to [Docker hub](https://hub.docker.com) - use the profile name for username not the email id.
2. `docker pull couchbase` - this will pull the latest version
3. `docker run -d --name db -p 8091-8094:8091-8094 -p 11210:11210 couchbase` - Run coucnhbase db in port 8091
4. Setup bucket and create user for the bucket (Important : user name and the bucket name should be same)
5. `./gradlew build` to build the jar ( `-x test` to exculde test task)
6. `./gradlew bootRun` or `java -jar ./build/libs/stats-ai*.jar`


#### Pending task
* unit test
* add logback-spring and access
* gitlab-ci or jenkins pipeline
* Openshift deploy config setup
* integration test case
 


 