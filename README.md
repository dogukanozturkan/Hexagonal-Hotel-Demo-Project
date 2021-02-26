# Hexagonal-Microservice-Hotel-Demo-Project

Modular Microservice Hotel Example

(Ps: project still have missing implementations)

### Technologies Used

You can use any programming language for implementing Hexagonal Architecture. Here is the list of technologies we used
for the demo application;

* Spring Boot 2
* Java 11
* Gradle 6
* Mono Repo
* Docker
* Mysql
* RabbitMQ
* Dockerized Integration Tests
* Eureka
* Zuul
* Consumer Driven Contract Testing

### Usage

After cloning the project on your local, you can use the following gradle commands to build and run tests.

```
# This command builds all modules, boot ups db and redis, runs contract tests and other tests, closes down db and redis 
./gradlew clean build

# If your local infra is already up, then this command only builds all modules and runs contract tests and other tests
./gradlew clean build -PskipInfraSetup
```

You can boot up all apis and infra with the following commands.

```
# This command boot ups db, redis and all apis
./run.sh up-all

# This command stops db, redis and kills all apis
./run.sh down-all
```
