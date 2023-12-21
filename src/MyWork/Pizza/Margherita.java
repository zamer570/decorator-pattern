package MyWork.Pizza;

public class Margherita implements BasePizza {
    @Override
    public String getDescription() {
        return "Margherita";
    }

    @Override
    public int cost() {
        return 100;
    }
}
