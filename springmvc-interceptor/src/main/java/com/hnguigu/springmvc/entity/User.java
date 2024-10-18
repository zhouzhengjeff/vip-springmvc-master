package com.hnguigu.springmvc.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private static final long serialVersionUID = 3098990771046478936L;
    private Long id;
    private String name;
    private String password;
}
