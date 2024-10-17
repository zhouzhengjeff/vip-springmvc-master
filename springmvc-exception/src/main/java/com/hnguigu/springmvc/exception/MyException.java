package com.hnguigu.springmvc.exception;

/**
 * uncheck exception
 * 非受查异常，不用显示给出异常处理
 * 受查异常，一般情况下继承Exception，必须给出显示处理（try...catch，throw）
 */
public class MyException extends RuntimeException {

    private String message;

    public MyException() {
    }

    public MyException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
