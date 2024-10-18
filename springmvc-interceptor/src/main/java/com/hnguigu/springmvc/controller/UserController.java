package com.hnguigu.springmvc.controller;

import com.hnguigu.springmvc.entity.User;
import com.hnguigu.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 进入登录页面
     *
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    /**
     * 登录的处理
     *
     * @param name
     * @param password
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String name, String password, Model model, HttpSession session) {
        User user = this.userService.authenticate(name, password);

        if (user != null) {
            // 设置Session范围的属性
            session.setAttribute("user", user);
            return "user/index";
        }

        return "login";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "user/index";
    }
}
