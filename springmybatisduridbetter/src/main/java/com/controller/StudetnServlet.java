package com.controller;

import com.entity.Student;
import com.service.StudentService;
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
public class StudetnServlet extends HttpServlet {
    //    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(req.getServletContext());
//        StudentService studentService = context.getBean("studentService",StudentService.class);
//        Student student =studentService.getById();
//        req.setAttribute("mystudent",student);
//        req.getRequestDispatcher("index.jsp").forward(req,resp);
//    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(req.getServletContext());
        StudentService studentService = context.getBean("studentService", StudentService.class);
        List<Student> student = studentService.getall();
        req.setAttribute("mystudent", student);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
