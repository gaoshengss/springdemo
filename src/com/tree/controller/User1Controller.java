package com.tree.controller;

import com.tree.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cqy on 17-7-17.
 */


@Controller
public class User1Controller {

    @ModelAttribute
    public void userModel(String loginname, String password, Model model){
        User user = new User();
        user.setLoginName(loginname);
        user.setPassword(password);

        model.addAttribute("user",user);
    }

    @RequestMapping("/login1")
    public String login(Model model){
        User user =(User) model.asMap().get("user");
        System.out.println(user.getLoginName());

        user.setUserName("测试1");

        return "result";
    }
}
