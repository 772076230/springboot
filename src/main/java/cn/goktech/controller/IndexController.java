package cn.goktech.controller;


import cn.goktech.beans.IndexImg;
import cn.goktech.service.IndexImgService;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/*@Controller
@RequestMapping(value = "/index")*/

public class IndexController {
    @Autowired
    IndexImgService indexImgService;



    /*@RequestMapping(value = "/init")*/

    @ResponseBody
    public String init(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView view = new ModelAndView();


        //首站轮播广告
        List<IndexImg> ctmAdvers = indexImgService.queryAvders();
        System.out.println(ctmAdvers);
        view.addObject("ctmAdvers", ctmAdvers);
        return "index";
    }




}
