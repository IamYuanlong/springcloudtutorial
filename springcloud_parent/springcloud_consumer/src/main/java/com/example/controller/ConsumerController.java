package com.example.controller;

import com.example.pojo.User;
import com.example.server.Userserver;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @program: mylearncode
 * @description:
 * @author: yuan long
 * @create: 2020-12-14 12:00
 */
@RestController
@RequestMapping("/consumer")
//@DefaultProperties(defaultFallback = "backMessage1")
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    DiscoveryClient discoveryClient;
    @Autowired
    private Userserver userserver;

    @GetMapping("/{id}")
//    @HystrixCommand
//    @HystrixCommand(fallbackMethod = "backMessage")
    public User getUser(@PathVariable Integer id) {
//        String url = "http://localhost:8080/testserver/" + id;
        //获取eureka中注册的user-service的实例
//        List<ServiceInstance> serviceInstances = discoveryClient.getInstances("springcloud-server");
//        ServiceInstance serviceInstance = serviceInstances.get(0);
//
//        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/testserver/" + id;
//        String url = "http://springcloud-server/testserver/" + id;
//        return restTemplate.getForObject(url, String.class);
        return userserver.getUser(id);
    }
//
//    public User backMessage(Integer id) {
//        User user=new User();
//        user.setAge(200);
//        user.setName("服务器熔断了");
//        return user;
//    }
//
//    public User backMessage1() {
//        User user=new User();
//        user.setAge(200);
//        user.setName("网络拥挤");
//        return user;
//    }


}
