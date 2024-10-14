package com.hnguigu.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/helloworld")
public class HelloworldController {

    /**
     * http://localhost:9999/helloworld/test
     *
     * @return
     */
    @RequestMapping("/test")
    public ModelAndView test() {
        // Model + View做成一个整体对象
        ModelAndView modelAndView = new ModelAndView();

        // 设置数据（相当于request.setAttribute()）
        modelAndView.addObject("info", "Hello World SpringMVC");

        // 跳转页面 此时的“result”称为逻辑视图名称
        modelAndView.setViewName("result");

        return modelAndView;
    }
}
