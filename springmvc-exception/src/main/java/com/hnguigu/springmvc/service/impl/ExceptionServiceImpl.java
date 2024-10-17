package com.hnguigu.springmvc.service.impl;

import com.hnguigu.springmvc.exception.MyException;
import com.hnguigu.springmvc.service.ExceptionService;
import org.springframework.stereotype.Service;

@Service
public class ExceptionServiceImpl implements ExceptionService {

    @Override
    public void service() {
        try {
            int i = 10 / 0;
        } catch (Exception e) {
            throw new MyException("您出错了，因为除以零了");
        }
    }
}
