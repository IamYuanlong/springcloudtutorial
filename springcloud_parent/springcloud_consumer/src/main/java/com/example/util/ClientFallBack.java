package com.example.util;

import com.example.pojo.User;
import com.example.server.Userserver;
import org.springframework.stereotype.Component;

/**
 * @program: mylearncode
 * @description:
 * @author: yuan long
 * @create: 2020-12-17 17:05
 */
@Component
public class ClientFallBack implements Userserver {

    @Override
    public User getUser(Integer id) {
        User user=new User();
        user.setAge(200);
        user.setName("网络拥挤");
        return user;
    }
}
