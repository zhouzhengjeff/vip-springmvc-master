package com.hnguigu.springmvc.controller;

import com.hnguigu.springmvc.entity.User;
import com.hnguigu.springmvc.vo.Result;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
@RequestMapping("/details")
public class DetailController {

    @RequestMapping(value = "/convert", method = RequestMethod.GET)
    public String convert() {
        return "/detail/converter";
    }

    /**
     * fallbackPatterns：兜底（其他方案）
     * @param birthday
     * @return
     */
    @RequestMapping(value = "/convert", method = RequestMethod.POST)
    public String convert(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE, pattern = "yyyy-MM-dd", fallbackPatterns = {
            "yyyy/MM/dd", "yyyy-MM-dd HH:mm:ss"}) Date birthday) {
        System.out.println(birthday);
        return "success";
    }

    /**
     * @return map 将map转换成json格式字符串
     * @ResponssseBody 将返回的对象转成JSON格式字符串，然后发送到前端
     */
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> test() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "hnguigu");
        map.put("age", 12);
        return map;
    }

    @RequestMapping(value = "/test1", method = RequestMethod.POST)
    @ResponseBody
    public Result test1() {
        User user = new User();
        user.setId(1L);
        user.setName("zhangsan");
        user.setPassword("admin");
        user.setSalary(12.34F);
        user.setBirthday(new Date());

        Result result = new Result();
        result.setFlag("true");
        result.setCode("20000");
        result.setData(user);

        return result;
    }

    @RequestMapping(value = "/test2", method = RequestMethod.POST)
    @ResponseBody
    public Result test2() {
        User user1 = new User();
        user1.setId(1L);
        user1.setName("zhangsan");
        user1.setPassword("admin");
        user1.setSalary(12.34F);
        user1.setBirthday(new Date());

        User user2 = new User();
        user2.setId(2L);
        user2.setName("lisi");
        user2.setPassword("admin");
        user2.setSalary(55.34F);
        user2.setBirthday(new Date());

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);


        Result result = new Result();
        result.setFlag("true");
        result.setCode("20000");
        result.setData(userList);

        return result;
    }

    @RequestMapping(value = "/test3", method = RequestMethod.POST)
    @ResponseBody
    public String test3() {
        return "success";
    }

    @RequestMapping(value = "/test4", method = RequestMethod.GET)
    public ModelAndView test4() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "hnguigu");
        modelAndView.addObject("age", 12);
        modelAndView.setViewName("detail/success");

        return modelAndView;
    }

}
