package xxx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xxx.CoffeeMachine;

public class Main {
    public static void main(String... args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
        CoffeeMachine coffeeMachine = context.getBean(CoffeeMachine.class);
        coffeeMachine.makeCoffee("Java");
    }
}
