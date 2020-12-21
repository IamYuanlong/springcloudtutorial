package com.example.server;

import com.example.pojo.User;
import com.example.util.ClientFallBack;
import com.example.util.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: mylearncode
 * @description:
 * @author: yuan long
 * @create: 2020-12-17 16:16
 */
@FeignClient(value = "springcloud-server",fallback = ClientFallBack.class,configuration = FeignConfig.class)
public interface Userserver {

    @GetMapping("/testserver/{id}")
    User getUser(@PathVariable("id") Integer id);
}
