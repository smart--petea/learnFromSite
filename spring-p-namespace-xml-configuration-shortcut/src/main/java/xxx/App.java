package xxx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xxx.CoffeeMachine;

public class App {
    public static void main(String... args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");

        //get bean with property
        CoffeeMachine coffeeMachine = context.getBean("coffeeMachine", CoffeeMachine.class);
        System.out.println(coffeeMachine);

        //get bean wit p-namespace
        CoffeeMachine pCoffeeMachine = context.getBean("pCoffeeMachine", CoffeeMachine.class);
        System.out.println(pCoffeeMachine);
    }
}
