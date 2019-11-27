package com.controller;

import com.entity.Emp;
import com.entity.EmpVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ControllerTest {
    @GetMapping("/")
    public String handler(){
        return "index";
    }
    @GetMapping("/wrapper")
    public String handler(String abc,Integer pageNo){
        System.out.println("---" + abc);
        System.out.println("-----debug: pageNo = " + pageNo);
        return "index";
    }
    @GetMapping("/simple")
    public String handler(int pageNo){
        System.out.println("pageNo = " + pageNo);
        return "index";
    }
    @GetMapping("/simple2")
    public String handler2(@RequestParam(value = "page",required = true,defaultValue = "1") int pageNo){
        System.out.println("pageNo = " + pageNo);
        return "index";
    }
    @GetMapping("/simple/page/{pageNo}")
    public String index3(@PathVariable("pageNo") int pageNo){

        System.out.println("-----debug: pageNo = " + pageNo);
        return "index";
    }
    @GetMapping("/complex")
    public String handler(Emp emp){
        System.out.println("emp = " + emp);
        return "index";
    }
    @GetMapping("/list")
    public String handler(EmpVo empVo){
        System.out.println("empvo = " + empVo);
        return "index";
    }
    @GetMapping("/array")
    public String halder(String[] name){
        System.out.println("name = " + name);
        return "index";

    }
    @GetMapping("/req")
    public String handler(HttpServletRequest request){
        return "index";
    }
}
