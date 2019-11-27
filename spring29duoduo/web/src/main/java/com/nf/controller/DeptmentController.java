package com.nf.controller;


import com.nf.service.impl.DeptmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dept")
public class DeptmentController {
    @Autowired
    private DeptmentService deptmentService;
    @RequestMapping("/list")
    public String list() {

        return "/dept/list";
    }
    @RequestMapping("/delete")
    public String delete(int deptid) {
        deptmentService.deleteById(deptid);
        return "redirect:/dept/list";
    }
}
