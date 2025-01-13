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

}