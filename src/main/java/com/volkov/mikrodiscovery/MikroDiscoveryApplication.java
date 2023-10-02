package com.volkov.mikrodiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MikroDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MikroDiscoveryApplication.class, args);
    }
}
