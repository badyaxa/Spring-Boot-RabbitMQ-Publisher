# Spring-Boot-RabbitMQ-Publisher

##   port: 8081

```
mvn clean package
docker build -t badyaxa/spring-boot-rabbitmq-publisher .
docker tag badyaxa/spring-boot-rabbitmq-publisher badyaxa/spring-boot-rabbitmq-publisher
docker push badyaxa/spring-boot-rabbitmq-publisher
```

```
docker build -t badyaxa/spring-boot-rabbitmq-publisher:1.0.0 .
docker tag badyaxa/spring-boot-rabbitmq-publisher:1.0.0 badyaxa/spring-boot-rabbitmq-publisher:1.0.0
docker push badyaxa/spring-boot-rabbitmq-publisher:1.0.0
```

* Run all in Docker containers:
```ssh
docker run -d -p 5672:5672 -p 15672:15672 --name my-rabbit rabbitmq:3-management
docker run -d -p 8081:8081 --name rabbitmq-publisher badyaxa/spring-boot-rabbitmq-publisher
docker run -d -p 8082:8082 --name rabbitmq-consumer badyaxa/spring-boot-rabbitmq-consumer
```


* RabbitMQ web Console: http://localhost:15672/
    - guest
* publisher POST localhost:8081/message/
* consumer POST localhost:8082/message/
