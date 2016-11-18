package xxx;

import xxx.CoffeeService;

public class CoffeeMachine {
    private CoffeeService coffeeService;

    public void makeCoffee(String beans) {
        coffeeService.makeCoffee(beans);
    }

    public void setCoffeeService(CoffeeService coffeeService) {
        System.out.println("SETTTTTTTTTTTTTTER");
        this.coffeeService = coffeeService;
    }
}
