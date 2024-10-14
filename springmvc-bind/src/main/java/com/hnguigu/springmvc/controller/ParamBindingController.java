package com.hnguigu.springmvc.controller;

import com.hnguigu.springmvc.dto.UserDTO;
import com.hnguigu.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;
import java.util.List;

@Controller
@RequestMapping("/binding")
public class ParamBindingController {

    @RequestMapping("/test1")
    public String test1(String name, String password, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("password", password);
        return "success";
    }


    @RequestMapping("/test2")
    public String test2(@RequestParam("username") String name, String password, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("password", password);
        return "success";
    }

    @RequestMapping("/test3")
    public String test3(User user, Model model) {
        model.addAttribute("user", user);
        return "success";
    }

    @RequestMapping(value = "/test4",method = RequestMethod.GET)
    public String test4(String[] inters,Model model) {
        model.addAttribute("inters", inters);
        return "test4";
    }

    /**
     * 会抛出异常
     * @param inters
     * @param model
     * @return
     */
    @RequestMapping(value = "/test5",method = RequestMethod.GET)
    public String test5(@RequestParam("inters") List<String> inters, Model model) {
        model.addAttribute("inters", inters);
        return "test4";
    }

    /**
     * 会抛出异常
     * @param inters
     * @param model
     * @return
     */
    /*@RequestMapping(value = "/test5",method = RequestMethod.GET)
    public String test5(UserDTO userDTO, Model model) {
        model.addAttribute("userDTO", userDTO);
        return "test5";
    }*/

    @RequestMapping(value = "/test6",method = RequestMethod.GET)
    public String test6(UserDTO userDTO, Model model) {
        model.addAttribute("userDTO", userDTO);
        return "test6";
    }

    @RequestMapping(value = "/test7",method = RequestMethod.POST)
    public String test7(@RequestBody User user, Model model) {
        model.addAttribute("user", user);
        return "test7";
    }


}
