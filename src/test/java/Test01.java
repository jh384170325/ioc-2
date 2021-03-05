import com.woniu.config.ConfigApp;
import com.woniu.domain.Student;
import com.woniu.service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

public class Test01 {


    ClassPathXmlApplicationContext applicationContext;
    AnnotationConfigApplicationContext applicationContext2;

    @Before
    public void before() {
        applicationContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
        applicationContext2 = new AnnotationConfigApplicationContext(ConfigApp.class);
    }


    @Test
    public void test01() {
        StudentService userService = applicationContext.getBean("studentServiceImpl", StudentService.class);
        Student student = applicationContext.getBean("student", Student.class);
        userService.save();
        userService.updata();
        userService.delete();
        userService.select(student);
    }

    @Test
    public void test02() {
        StudentService userServiecImpl = applicationContext2.getBean("studentServiceImpl", StudentService.class);
        Student student = applicationContext2.getBean("student", Student.class);
        userServiecImpl.save();
        userServiecImpl.delete();
        userServiecImpl.updata();
        userServiecImpl.select(student);
    }

}