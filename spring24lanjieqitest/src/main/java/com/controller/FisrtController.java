package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class FisrtController {
    @RequestMapping("/index")
    public String handler(){
        System.out.println("diyici");
        return "index";
    }
    @RequestMapping("/login")
    public ModelAndView handler2(HttpServletRequest request){
        System.out.println("进入 /login");
        ModelAndView modelAndView = new ModelAndView();
        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");
        HttpSession session = request.getSession();
        session.setAttribute("user",user);

        modelAndView.setViewName("/index");
        return modelAndView;
    }
}
