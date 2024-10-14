package com.hnguigu.springmvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloworldController implements Controller {

    /**
     * @param request  current HTTP request
     * @param response current HTTP response
     * @return ModelAndView
     * @throws Exception
     */
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // Model + View做成一个整体对象
        ModelAndView modelAndView = new ModelAndView();

        // 设置数据（相当于request.setAttribute()）
        modelAndView.addObject("info", "Hello World SpringMVC,HandlerMapping Study");

        // 跳转页面 此时的“result”称为逻辑视图名称
        modelAndView.setViewName("result");

        return modelAndView;
    }
}
