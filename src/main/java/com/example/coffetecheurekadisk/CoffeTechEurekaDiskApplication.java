package com.example.coffetecheurekadisk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CoffeTechEurekaDiskApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoffeTechEurekaDiskApplication.class, args);
    }

}
