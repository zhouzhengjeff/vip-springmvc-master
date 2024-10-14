package com.hnguigu.springmvc.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 后端向前端发送的一个对象（flag code data）
 * 这个对象会转换成JSON
 *
 * @param <T>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {

    /**
     * true | false
     */
    private String flag;

    /**
     * 20000 成功
     * 40004 ....
     * 50000 ....
     */
    private String code;

    private T data;

}
