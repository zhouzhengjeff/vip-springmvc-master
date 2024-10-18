package com.hnguigu.springmvc.service;

import com.hnguigu.springmvc.entity.User;

public interface UserService {

    /**
     * 认证
     * 根据用户名称和用户密码
     * @param username
     * @param password
     * @return
     */
    User authenticate(String username, String password);


}
