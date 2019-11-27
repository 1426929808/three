package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controllerd {
    @RequestMapping("/index")
    public String handler(){
        return "index";
    }
    //requestMapping它是支持ant地址格式
    //匹配根目录下的带index后缀的网页
    //(匹配项目根路径下任何的.index 文件//.jsp 文件)
    @RequestMapping("/**/*index")
    public String handler2(){
        return "index";
    }
    //这种配置方法,就是默认处理方法
    @RequestMapping("*")
    public String handler3(){
        return "index";
    }
    @RequestMapping(value = {"/index","handler2"})
    public String handler4(){
        return "index";
    }
}
