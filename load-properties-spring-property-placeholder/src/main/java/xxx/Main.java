package xxx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xxx.Course;

public class Main {
    public static void main(String...args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
        Course course = context.getBean(Course.class);
        System.out.println(course);
    }
}
