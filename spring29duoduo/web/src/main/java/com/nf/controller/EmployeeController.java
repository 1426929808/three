package com.nf.controller;

import com.github.pagehelper.PageInfo;
import com.nf.entity.Employee;
import com.nf.service.impl.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/list")
    public String list(@RequestParam(value = "pageNum",
            required = false,defaultValue = "1") int pageNum,
                       @RequestParam(value = "pageSize",
                               required = false,defaultValue = "5") int pageSize, Model model) {
        List<Employee> employee = employeeService
                .getAll(pageNum, pageSize);

        PageInfo pageInfo = new PageInfo(employee);
        model.addAttribute("list", pageInfo);
        return "employee/list";
    }
    @GetMapping("/add")
    public String add(){
        return "/employee/add";
    }

    @PostMapping("/insert")
    public String insert(@Valid Employee employee,
                         BindingResult bindingResult) {
        if(bindingResult.hasErrors()){

            return "/employee/add";
        }
        employeeService.insert(employee);
        return "redirect:/emp/list";
    }
    @GetMapping("/delete")
    public  String delete(Integer deptid){
        System.out.println("尝试删除");
        employeeService.delete(deptid);
        return "redirect:/emp/list";
    }
}
