package com.yuqn.controller;

import com.yuqn.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class StudentController {

    @Resource
    private Student student;

    @RequestMapping(value = "/go")
    @ResponseBody
    public String goStudent(){
        return "student的内容为"+student.toString();
    }
}
