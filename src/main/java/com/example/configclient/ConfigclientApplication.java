package com.example.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringCloudApplication
public class ConfigclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigclientApplication.class, args);
    }

}
