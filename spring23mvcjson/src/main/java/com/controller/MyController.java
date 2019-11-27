package com.controller;

import com.entity.EmpVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class MyController {
    @RequestMapping("/index")
    public String handler(){
        return "index";
    }

    @RequestMapping("/list")
    @ResponseBody
    public EmpVo list(){
        EmpVo empVo = new EmpVo(1,"hhhh",new Date());
        return empVo;
    }
    @RequestMapping("/insert")
    @ResponseBody
    public EmpVo insert(@RequestBody EmpVo empVo) {
        System.out.println("-----debug: empVo = " + empVo);
        EmpVo result = new EmpVo(2, "server2", new Date());
        return result;
    }
    @RequestMapping("/insert2")
    @ResponseBody
    public EmpVo insert2( EmpVo empVo) {
        System.out.println("-----debug: empVo = " + empVo);
        EmpVo result = new EmpVo(3, "server3", new Date());
        return result;
    }
}
