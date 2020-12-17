package com.example.controller;

import com.example.server.User;
import org.springframework.web.bind.annotation.*;

/**
 * @program: mylearncode
 * @description:
 * @author: yuan long
 * @create: 2020-12-14 11:13
 */
@RestController
@RequestMapping("/testserver")
public class TestController {

    @GetMapping("/{id}")
   public User getUser(@PathVariable Integer id){
       User user=new User();
       user.setAge(id);
       user.setName("test");
        System.out.println("调用的服务ID"+id);
       return user;
   }
}
