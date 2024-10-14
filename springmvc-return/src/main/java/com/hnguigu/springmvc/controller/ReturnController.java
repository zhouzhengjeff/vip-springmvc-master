package com.hnguigu.springmvc.controller;

import com.hnguigu.springmvc.vo.Result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/return")
public class ReturnController {

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    @ResponseBody
    public String test1() {
        return "success";
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public String test2(Model model) {
        model.addAttribute("message", "success");
        return "success";
//        return "forward:/WEB-INF/views/success.jsp";
    }

    @RequestMapping(value = "/test3", method = RequestMethod.GET)
    @ResponseBody
    public Result test3() {
        Result result = new Result<>();
        result.setFlag("true");
        result.setCode("200");
        result.setData("success");
        return result;
    }
}
