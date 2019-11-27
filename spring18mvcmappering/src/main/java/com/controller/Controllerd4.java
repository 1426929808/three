package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dept")
public class Controllerd4 {
    @RequestMapping("/get")
    public String index(){
        return  "index";
    }
    @RequestMapping("/post")
    public String index2(){
        return  "index";
    }
    @RequestMapping("/delete")
    public String index3(){
        return  "index";
    }
    @RequestMapping("/put")
    public String index4(){
        return  "index";
    }
    @RequestMapping("/patch")
    public String index5(){
        return  "index";
    }
}
