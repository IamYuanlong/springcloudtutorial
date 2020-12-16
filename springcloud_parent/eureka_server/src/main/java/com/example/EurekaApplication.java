package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: mylearncode
 * @description:
 * @author: yuan long
 * @create: 2020-12-14 17:11
 */
@EnableEurekaServer
@SpringBootApplication
@EnableEurekaClient
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }
}
