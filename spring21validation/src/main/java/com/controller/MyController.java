package com.controller;

import com.entity.TestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MyController {

   @RequestMapping("/test")
   //valid这个注释就是声明testentity这个需要被校验
   //bindingresult没一个被检验的参数都是需要添加，用来检验错误信息 eg：message错误信息
    public ModelAndView modelAndView (@Valid TestEntity testEntity, BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView();
        //hasErrors()有错误信息
        if (bindingResult.hasErrors()){
            //字段错误list集合
            List<FieldError> error = bindingResult.getFieldErrors();
            for (FieldError fieldError : error) {
                //addobject设置属性（字段，错误信息）
                modelAndView.addObject(fieldError.getField(),fieldError.getDefaultMessage());
            }
            //跳转界面
            modelAndView.setViewName("error");
        }else {
            modelAndView.setViewName("ok");
        }
       System.out.println("testEntity------"+testEntity);
        return modelAndView;
   }
}
