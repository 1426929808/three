package impl;

import com.config.MyConfig;
import com.entity.Employee;
import com.service.EmoloyeeService;
import com.service.impl.EmployeeServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyConfig.class)
public class DeptServiceImplTest {
    @Autowired
    private EmoloyeeService emoloyeeService;

    @Test
    public void getAll() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        EmoloyeeService bean = context.getBean(EmoloyeeService.class);
        List<Employee> result = bean.getall(1, 5);

//        List<Employee> result = emoloyeeService.getall(2, 3);
        for (Employee employeeEntity : result) {
            System.out.println("-----debug: employeeEntity = " + employeeEntity);
        }
    }

    @Test
    public void txDemo() {

        emoloyeeService.deleteAfterinsert();
    }
}