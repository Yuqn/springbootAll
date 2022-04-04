package com.yuqn.controller;

import com.yuqn.entity.Figure;
import com.yuqn.service.FigureService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class FigureController {

    @Resource
    private FigureService figureService;

    @RequestMapping("/FigSel")
    @ResponseBody
    public String selFig(Integer id){
        System.out.println("================开始了");
        Figure figure=figureService.figSel(id);
        return "查询记录为"+figure;
    }

    @RequestMapping("/go")
    @ResponseBody
    public String selFig(){
        return "go";
    }
}
