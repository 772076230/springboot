package cn.goktech.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 87453 on 2021/10/21.
 */
@Controller

@RequestMapping("/stu")
public class StudentController {

  @RequestMapping("/sel")
    public String queryAll(Model model) {

        return "index";
    }


    @RequestMapping("/sel2")
    public String queryAll1(Model model) {

        return "login";
    }



    @RequestMapping("/sel3")
    public String queryAll12(Model model) {

        return "order-add";
    }





}








