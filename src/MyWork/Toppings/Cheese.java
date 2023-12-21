package MyWork.Toppings;

import MyWork.Pizza.BasePizza;

public class Cheese extends Topping {

    public Cheese(BasePizza basePizza){
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription() + ", Cheese";
    }

    @Override
    public int cost() {
        return basePizza.cost() + 10;
    }
}
