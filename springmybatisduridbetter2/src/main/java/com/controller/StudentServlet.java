package com.controller;

import com.entity.Student;
import com.github.pagehelper.PageInfo;
import com.service.StudentService;
import com.service.impl.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("/index")
public class StudentServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
        StudentServiceImpl studentservice = context.getBean("studentservice", StudentServiceImpl.class);

        int pageNum =Integer.parseInt(req.getParameter("page"));
        int pageSize = Integer.parseInt(req.getParameter("pageSize"));
        List<Student>students =studentservice.getall(pageNum,pageSize);
        PageInfo<Student> pageInfo = new PageInfo<>(students,2);
        //PageInfo的构造函数的第二个参数就是设定导航数字的个数的.
        req.setAttribute("pageInfo",pageInfo);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
