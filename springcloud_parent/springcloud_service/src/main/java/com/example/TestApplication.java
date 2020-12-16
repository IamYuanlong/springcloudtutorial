package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: mylearncode
 * @description: 启动类
 * @author: yuan long
 * @create: 2020-12-14 11:15
 */
@SpringBootApplication
@EnableDiscoveryClient //开启Eureka客户端发现功能
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
