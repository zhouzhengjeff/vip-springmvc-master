package com.hnguigu.spring.test;

import com.hnguigu.springmvc.entity.User;
import org.junit.Test;

import java.util.*;

public class UserTest {

    @Test
    public void test() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1L, "hnguigu", "123456", 1000F, new Date()));
        userList.add(new User(2L, "zhangsan", "66666", 2000F, new Date()));
        userList.add(new User(3L, "lisi", "admin", 3000F, new Date()));
        userList.add(new User(4L, "wangwu", "test", 4000F, new Date()));
        userList.add(new User(5L, "abc", "abc", 5000F, new Date()));

        userList.add(new User(1L, "hnguigu", "123456", 1000F, new Date()));

        System.out.println(userList.size());

        userList.remove(new User(5L, "abc", "abc", 5000F, new Date()));


    }

    @Test
    public void test1() {
        Set<User> set = new HashSet<>();
        set.add(new User(1L, "hnguigu", "123456", 1000F, new Date()));

        // 因为重写了两equlas()和hashCode() 所以这行代码相当于没有执行？？？？？？
        set.add(new User(1L, "hnguigu", "123456", 1000F, new Date()));
        System.out.println(set.size());// 2
    }
}
