package com.yuqn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping(value = "/zlb")
    public String myWeb(Model model){
        model.addAttribute("data","詹老板");
        return "index";
    }
}
