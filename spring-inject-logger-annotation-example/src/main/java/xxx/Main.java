package xxx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import xxx.AppConfig;

public class Main {
    public static void main(String...args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        StepService stepService = context.getBean(StepService.class);

        stepService.step(1);
        stepService.step(2);
        stepService.step(3);

    }
}
