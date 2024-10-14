package com.hnguigu.springmvc.controller;

import com.hnguigu.springmvc.entity.User;
import com.hnguigu.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
// value="/user" 一般情况下每一个模块会有一个namespace(命名空间)，用来区分别的模块（别的模块/xxx’）
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询所有用户
     *
     * @param model 用来设置属性 Model 对象可以直接使用（Spring已经将它实例化而且将它纳入容器中成为Bean）
     * @return 逻辑视图名称
     */
    @RequestMapping(value = "/findAll", method = {RequestMethod.GET})
    public String findAll(Model model) {

        // 调用业务逻辑
        List<User> userList = this.userService.findAll();

        // 设置属性 相当于设置了request范围的属性
        model.addAttribute("userList", userList);

        // 跳转 服务器端跳转 逻辑视图名称
        return "user/list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(User user) {
        // 调用业务逻辑
//        user.setBirthday(new Date());
        this.userService.addUser(user);

        // 跳转。重定向？为什么？会产生重复提交
        return "redirect:/users/findAll";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return "user/add";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable Long id) {
        User user = this.userService.findUserById(id);
        this.userService.deleteUser(user);
        return "redirect:/users/findAll";
    }


    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable Long id, Model model) {
        User user = this.userService.findUserById(id);
        model.addAttribute("user", user);
        return "user/edit";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String edit(User user) {
        user.setBirthday(new Date());
        this.userService.modifyUser(user);
        return "redirect:/users/findAll";
    }
}
