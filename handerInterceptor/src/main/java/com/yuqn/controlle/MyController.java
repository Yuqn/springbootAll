package com.yuqn.controlle;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
//    第一个方法
    @RequestMapping(value = "/hello/one")
    @ResponseBody
    public String One(){
        return "第一个方法";
    }
//    第二个方法
    @RequestMapping(value = "/user/go")
    @ResponseBody
    public String Two(){
    return "第二个方法";
}
}
