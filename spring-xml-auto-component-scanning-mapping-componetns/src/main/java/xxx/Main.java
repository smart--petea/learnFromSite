package xxx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import xxx.StepService;

public class Main {
    public static void main(String...args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resource/app-config.xml");
        StepService stepService = context.getBean(StepService.class);

        System.out.println(stepService.retrieveStep());

    }
}
