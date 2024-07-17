package com.kafka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        System.out.println("HOST: " + System.getenv("HOST"));
        System.out.println("POSTGRES_USERNAME: " + System.getenv("POSTGRES_USERNAME"));
        System.out.println("POSTGRES_PASSWORD: " + System.getenv("POSTGRES_PASSWORD"));
        System.out.println("POSTGRES_DB: " + System.getenv("POSTGRES_DB"));
        System.out.println("KAFKA_BOOTSTRAP_SERVERS: " + System.getenv("KAFKA_BOOTSTRAP_SERVERS"));
        System.out.println("KAFKA_SUBSCRIBED_TOPICS: " + System.getenv("KAFKA_SUBSCRIBED_TOPICS"));
        SpringApplication.run(ConsumerApplication.class, args);
    }


}


