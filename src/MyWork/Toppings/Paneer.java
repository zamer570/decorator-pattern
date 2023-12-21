package MyWork.Toppings;

import MyWork.Pizza.BasePizza;

public class Paneer extends Topping {

    public Paneer(BasePizza basePizza){
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription() + ", Paneer";
    }

    @Override
    public int cost() {
        return basePizza.cost() + 80;
    }
}
