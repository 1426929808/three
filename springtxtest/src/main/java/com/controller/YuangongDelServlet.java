package com.controller;

import com.entity.Yuangong;
import com.service.YuangongService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import java.io.IOException;

@WebServlet("/del")
public class YuangongDelServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        YuangongService service = context.getBean("service", YuangongService.class);

        int id = Integer.parseInt(req.getParameter("id"));
        String page = req.getParameter("page");
        String pageSize = req.getParameter("pageSize");
        Yuangong byId = service.getById(id);
        service.insertwithdelete(byId,id);
        resp.sendRedirect(req.getContextPath()+"/index?page="+page+"&pageSize="+pageSize);
    }
}
