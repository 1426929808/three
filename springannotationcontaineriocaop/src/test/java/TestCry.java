import com.service.DbConfig;
import com.service.StudentService;
import com.service.impl.StudentServiceImpl;
import com.service.impl.SuanShu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCry {
    @Test
    public void testone(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentServiceImpl service = context.getBean(StudentServiceImpl.class);
        System.out.println(service);
        //((ConfigurableApplicationContext) context).close();
        //实现销毁办法

    }
    @Test
    public void  testtwo(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = context.getBean(StudentService.class);
        studentService.update();
    }
    @Test
    public void testjisuan(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SuanShu suanShu = context.getBean(SuanShu.class);
        int result = suanShu.add(1,2);
        System.out.println(result);
    }

    @Test
    public void testProperty(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DbConfig config = context.getBean(DbConfig.class);
        System.out.println(config.geturl());
        //System.out.println(config.getDriver());
    }

}
