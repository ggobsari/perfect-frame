package com.ggobsari.perfect_frame.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class Test {

    @GetMapping("/test")
    public String Main(){
        return "test";
    }

    @GetMapping("/layout")
    public String Layout(){
        return "layout/layout";
    }

    @GetMapping("/login")
    public String Login(){
        return "user/login";
    }

    @GetMapping("/signup")
    public String Signup(){
        return "user/signup";
    }

    @GetMapping("/profile")
    public String Profile(){
        return "user/profile";
    }

    @GetMapping("/buttons")
    public String Buttons(){
        return "buttons";
    }

}