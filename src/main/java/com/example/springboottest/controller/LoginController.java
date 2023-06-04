package com.example.springboottest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(ModelMap model, @RequestParam String email, @RequestParam String password) {
        if(email.equals("sj@gmail.com") && password.equals("1212")){
            model.put("email", email);
            return "welcome";
        }
        model.put("error", "Please provide correct email and password");
        return "login";
    }
}
