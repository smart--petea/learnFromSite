package xxx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xxx.Config;

public class Main {
    public static void main(String... args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
        Config config = context.getBean(Config.class);

        System.out.println(config);
    }
}
