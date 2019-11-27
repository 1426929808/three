package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dept")
public class Controllerd2 {
    @RequestMapping("/list")
    public String index(){
        return "index";
    }
}
