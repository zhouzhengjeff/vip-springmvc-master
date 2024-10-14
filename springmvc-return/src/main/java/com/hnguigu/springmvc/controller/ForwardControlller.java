package com.hnguigu.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/forward")
public class ForwardControlller {

    /**
     * Spring容器将这两个对象（HttpServletRequest和HttpServletResponse）已经注入到了方法的参数上
     *
     * @param request
     * @param response
     */
    @RequestMapping("/test")
    public void test(@Autowired HttpServletRequest request, @Autowired HttpServletResponse response) {
        try {
//            request.setAttribute("message", "success");
            request.getRequestDispatcher("/WEB-INF/views/success.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public String test2(Model model) {

        // 是不是相当于request.setAttribute("message", "redirect value")？？？？？？
        model.addAttribute("message", "redirect value");
        return "redirect:/forward/test";
    }

    @RequestMapping(value = "/test3", method = RequestMethod.GET)
    public void test3(HttpServletResponse response, HttpSession session) {
        try {
//            model.addAttribute("message", "redirect value");
            session.setAttribute("message", "redirect value");
            response.sendRedirect("/forward/test");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
