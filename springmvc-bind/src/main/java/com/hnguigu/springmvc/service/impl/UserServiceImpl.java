package com.hnguigu.springmvc.service.impl;

import com.hnguigu.springmvc.entity.User;
import com.hnguigu.springmvc.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private static List<User> userList;

    static {
        userList = new ArrayList<>();
        userList.add(new User(1L, "hnguigu", "123456", 1000F, new Date()));
        userList.add(new User(2L, "zhangsan", "66666", 2000F, new Date()));
        userList.add(new User(3L, "lisi", "admin", 3000F, new Date()));
        userList.add(new User(4L, "wangwu", "test", 4000F, new Date()));
        userList.add(new User(5L, "abc", "abc", 5000F, new Date()));
    }

    @Override
    public void addUser(User user) {
        userList.add(user);
    }

    @Override
    public void deleteUser(User user) {
        userList.remove(user);
    }

    @Override
    public void modifyUser(User user) {
        for (User tempUser : userList) {
            if (tempUser.getId().equals(user.getId())) {
                tempUser.setName(user.getName());
                tempUser.setPassword(user.getPassword());
                tempUser.setSalary(user.getSalary());
                tempUser.setBirthday(user.getBirthday());
                break;
            }
        }
    }

    @Override
    public User findUserById(Long id) {
        for (User user : userList) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return userList;
    }
}
