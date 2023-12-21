import MyWork.Pizza.BasePizza;
import MyWork.Pizza.Margherita;
import MyWork.Toppings.Cheese;
import MyWork.Toppings.Paneer;

public class Main {
    public static void main(String[] args) {
//        BasePizza pizza = new Paneer(new Cheese(new Margherita()));
        BasePizza pizza = new Margherita();
        pizza = new Cheese(pizza);
        pizza = new Paneer(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.cost());
    }
}