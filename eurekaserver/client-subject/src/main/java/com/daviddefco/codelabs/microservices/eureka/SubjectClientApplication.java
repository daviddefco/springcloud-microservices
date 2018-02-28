package com.daviddefco.codelabs.microservices.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SubjectClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SubjectClientApplication.class, args);
    }
}
