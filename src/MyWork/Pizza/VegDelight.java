package MyWork.Pizza;

public class VegDelight implements BasePizza {
    @Override
    public String getDescription() {
        return "Veg Delight";
    }
    @Override
    public int cost() {
        return 120;
    }
}
