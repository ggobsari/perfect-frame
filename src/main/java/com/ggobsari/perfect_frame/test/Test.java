package com.ggobsari.perfect_frame.test;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

public class Test {

    @GetMapping("/")
    public String Main(){
        return "index";
    }

}
