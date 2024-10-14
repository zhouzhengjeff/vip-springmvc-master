package com.hnguigu.springmvc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO implements Serializable {


    private static final long serialVersionUID = -6500636491465498715L;
    private List<String> inters;

    private Map<String,Object> map;
}
