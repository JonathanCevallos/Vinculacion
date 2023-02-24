package com.uteq.vinculacion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeConroller {
    @GetMapping({"/","/home", "/index"})
    public String index(){
        return "index";
    }

    @GetMapping("/powerpoint")
    public String powerpoint(){
        return "powerpoint";
    }
}
