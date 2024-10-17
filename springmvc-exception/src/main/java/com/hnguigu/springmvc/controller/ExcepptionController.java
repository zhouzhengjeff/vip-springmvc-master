package com.hnguigu.springmvc.controller;

import com.hnguigu.springmvc.service.ExceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/exception")
public class ExcepptionController {

    @Autowired
    private ExceptionService exceptionService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        this.exceptionService.service();
        return "success";
    }
}
