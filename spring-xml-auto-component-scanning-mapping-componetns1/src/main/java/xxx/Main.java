package xxx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import xxx.DancerService;

public class Main {
    public static void main(String...args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("app-config.xml");
        DancerService dancerService = context.getBean(DancerService.class);

        System.out.println(dancerService.doDance());
    }
}
