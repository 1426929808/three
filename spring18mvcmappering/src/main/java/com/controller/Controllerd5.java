package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dept")
public class Controllerd5 {
    //正则表达式，这里需要转义\\
    @PostMapping("/list/page/{pageno\\d}")
    public String index(){
        return  "index";
    }

}
