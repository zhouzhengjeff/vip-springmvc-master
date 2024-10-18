package com.hnguigu.springmvc.service.impl;

import com.hnguigu.springmvc.entity.User;
import com.hnguigu.springmvc.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User authenticate(String name, String password) {
        User user = null;

        if ("zhangsan".equals(name) && "admin".equals(password)) {
            user = new User();
            user.setId(1L);
            user.setName(name);
            user.setPassword(password);
            return user;
        }
        return null;
    }
}
