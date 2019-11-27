package com.controller;

import com.entity.Employee;
import com.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private EmpService empService;
    @RequestMapping("/index")

    public String index(){
        return "index";
    }
//    @RequestMapping(value = "/list")
//    @ResponseBody
//    public ResponseVO list(
//            @RequestParam(value = "pageNum",defaultValue = "1",required = false) int pageNum,
//
//            @RequestParam(value = "pageSize",defaultValue = "1",required = false)int pageSize){
//        List<Employee> result= empService.getAll(pageNum,pageSize);
//
//        ResponseVO responseVO = new ResponseVO();
//        responseVO.setCode("200");
//        responseVO.setMsg("success");
//        responseVO.setData(result);
//        return  responseVO;
//    }
}
