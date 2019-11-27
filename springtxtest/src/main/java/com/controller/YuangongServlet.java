package com.controller;

import com.entity.Yuangong;
import com.github.pagehelper.PageInfo;
import com.service.YuangongService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/index")
public class YuangongServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        YuangongService service = context.getBean("service", YuangongService.class);
        int pageNum =Integer.parseInt(req.getParameter("page"));
        int pageSize = Integer.parseInt(req.getParameter("pageSize"));
        List<com.entity.Yuangong> yuangongs = service.getall(pageNum,pageSize);
        PageInfo<com.entity.Yuangong> pageInfo = new PageInfo<>(yuangongs,3);
        //PageInfo的构造函数的第二个参数就是设定导航数字的个数的.
        req.setAttribute("pageInfo",pageInfo);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
