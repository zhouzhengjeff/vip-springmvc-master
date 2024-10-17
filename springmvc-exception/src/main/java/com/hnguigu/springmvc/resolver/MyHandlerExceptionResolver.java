package com.hnguigu.springmvc.resolver;

import com.hnguigu.springmvc.exception.MyException;
import org.springframework.util.ObjectUtils;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHandlerExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
                                         Exception ex) {
        ModelAndView modelAndView = new ModelAndView();

        // 出现异常
        if (!ObjectUtils.isEmpty(ex)) {

            // 异常如果是自定义的异常
            if (ex instanceof MyException) {
                MyException myException = (MyException) ex;
                String message = myException.getMessage();

                modelAndView.addObject("errorMessage", message);
                modelAndView.setViewName("error");
            }
        }

        return modelAndView;
    }
}
