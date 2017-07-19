package com.tree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cqy on 17-7-17.
 */
@Controller
public class HelloController {


    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String hello(Model model){
        model.addAttribute("message","Hello World");

        return "hello";


    }



}
