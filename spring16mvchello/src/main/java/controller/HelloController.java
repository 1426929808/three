package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@Component
public class HelloController {
    @RequestMapping("/index")
    //@RequestMapping("")
    //@RequestMapping("/")
    public  String handler(){
        return "hello";
    }
    //@RequestMapping("/")
    @RequestMapping("/index2")
    public  ModelAndView handler2(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        modelAndView.addObject("test","第一次尝试");
        return modelAndView;
    }

}
