package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Controllerd3 {
    @RequestMapping(value = "/index" ,method = RequestMethod.GET)
    public String index(){
        return "index";
    }
    @RequestMapping(value = "/index" ,method = RequestMethod.POST)
    public String index2(){
        return "index";
    }
    @RequestMapping(value = "/index2",
            method = RequestMethod.POST,
            params = "a=5",headers = "b=3",
            produces = "application/json",
            consumes = "text/html")
    public String index3(){
        return "index";
    }
}
