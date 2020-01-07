package com.learn.ymh.client_master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientMasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientMasterApplication.class, args);
    }

}
