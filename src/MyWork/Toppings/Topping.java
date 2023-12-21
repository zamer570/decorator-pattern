package MyWork.Toppings;

import MyWork.Pizza.BasePizza;

public abstract class Topping implements BasePizza {

    BasePizza basePizza;

    public Topping(BasePizza basePizza){
        this.basePizza = basePizza;
    }

}
