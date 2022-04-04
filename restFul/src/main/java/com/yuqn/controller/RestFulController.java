package com.yuqn.controller;

import org.springframework.web.bind.annotation.*;

/*
*  @RestController注解：包含了@Controller、@ResponseBody注解的功能
*  @GetMapping注解：相当于@RequestMapping(method = {RequestMethod.GET})，还有post，put等操作；
*                   他有value属性，是请求地址，其中{stuId}类似于占位符
*  @PathVariable注解：获取@GetMapping的{}值，并且赋值给方法对应参数
* */

@RestController
public class RestFulController {

    @GetMapping(value = "/queryStu/{stuId}")
    public String student(@PathVariable("stuId") Integer id){
        return "传递的id为"+id;
    }

    @PostMapping(value = "/AddStu/{stuId}")
    public String studenttwo(@PathVariable("stuId") Integer id){
        return "post传递值为"+id;
    }

    @PutMapping(value = "/putStu/{stuId}")
    public String studentthree(@PathVariable Integer stuId){
        return "put值为"+stuId;
    }
}
