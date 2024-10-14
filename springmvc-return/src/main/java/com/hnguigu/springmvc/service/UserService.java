package com.hnguigu.springmvc.service;

import com.hnguigu.springmvc.entity.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void deleteUser(User user);

    void modifyUser(User user);

    User findUserById(Long id);

    List<User> findAll();
}
