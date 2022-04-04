package com.yuqn.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

//    通过value的方法获取配置文件中的值
    @Value("${student.name}")
    private String name;
    @Value("${student.id}")
    private Integer id;
    @Value("${student.sex}")
    private String sex;

    @RequestMapping(value = "/my")
    @ResponseBody
    public String My(){
        return name+","+id+","+sex;
    }
}
