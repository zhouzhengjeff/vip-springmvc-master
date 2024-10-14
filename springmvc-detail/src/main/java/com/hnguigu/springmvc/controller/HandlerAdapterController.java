package com.hnguigu.springmvc.controller;

import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HandlerAdapterController implements HttpRequestHandler {

    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        request.setAttribute("info", "Hello World SpringMVC,HandlerMapping Study");
        request.getRequestDispatcher("/WEB-INF/views/result.jsp").forward(request, response);
    }
}
