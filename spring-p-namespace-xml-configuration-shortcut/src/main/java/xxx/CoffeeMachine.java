package xxx;

public class CoffeeMachine {
    private String bean;
    private double amount;

    public String getBean() {
        return bean;
    }

    public void setBean(String bean) {
        this.bean = bean;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "CoffeeMachine{" + 
            "bean='" + bean + '\'' + 
            '}';
    }
}
