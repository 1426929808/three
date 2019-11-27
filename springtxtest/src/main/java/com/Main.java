package com;

import com.entity.Yuangong;
import com.github.pagehelper.PageInfo;
import com.service.YuangongService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        YuangongService service = context.getBean("service",YuangongService.class);
//        service.insertwithdelete();
//        List<com.entity.Yuangong>yuangongs = service.getall(2,3);
//        for (Yuangong yuangong : yuangongs) {
//            System.out.println(yuangong);
//        }
        Yuangong byId = service.getById(8);
        System.out.println(byId);
        service.insertwithdelete(byId,7);
    }
}
