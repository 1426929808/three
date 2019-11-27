package com.controller;

import com.entity.Student;
import com.service.StudentService;
import com.service.StudentServiceImpl;
import com.spring.ApplicationContextUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/index")
public class StudentServlet extends HttpServlet {
//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        ApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
//        StudentService studentService = context.getBean("studentService",StudentService.class);
//        Student student = studentService.getById();
//        req.setAttribute("mystudent",student);
//        req.getRequestDispatcher("index.jsp").forward(req,resp);
//    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext context = ApplicationContextUtil.getApplicationContext(req);
        StudentService studentService = context.getBean("studentService", StudentService.class);
        Student student = studentService.getById();
        req.setAttribute("mystudent",student);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
