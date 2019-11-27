package com.controller;

import com.config.MyConfig;
import com.entity.Deptment;
import com.sevice.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class DpetInsertServlet  {
    @RequestMapping("/index")
    public String handler(){
        return "index";
    }
    @Autowired
    private DeptService service;
    @GetMapping("/insert")
    public ModelAndView insert(@Valid Deptment deptment, BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView();

        if (bindingResult.hasErrors()) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            for (FieldError fieldError : fieldErrors) {
                modelAndView.addObject(fieldError.getField(),fieldError.getDefaultMessage());
            }

            modelAndView.setViewName("index");

        }else {
            modelAndView.setViewName("ok");
            service.insert(deptment);
        }

//        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
//        context.register(MyConfig.class);
//        context.refresh();
//        DeptService deptService=context.getBean(DeptService.class);

        return modelAndView;
    }
}
