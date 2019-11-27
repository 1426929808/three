package com.controller;

import com.entity.Emp;
import com.formatter.EmpFormatter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.text.DateFormatter;
import java.util.Date;

@Controller
@RequestMapping("formatter")
public class FormatterController {
//    @InitBinder
//    public void xxxx(WebDataBinder dataBinder) {
//        dataBinder.addCustomFormatter(new EmpFormatter());
//        dataBinder.addCustomFormatter(new DateFormatter());
//    }
    ///formatter/date?date=2020-10-10
    @GetMapping("/date")
    public String receiveDate(@DateTimeFormat(pattern = "yyyy-MM-dd")Date date){
        System.out.println("date = " + date);
        return"index";
    }
    //formatter/emp?xxx=hhh,jjj
    @GetMapping("/emp")
    public String receiveEmp(@RequestParam("xxx")Emp emp){
        System.out.println("emp = " + emp);
        return "index";
    }
}
