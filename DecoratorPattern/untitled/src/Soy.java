public class Soy extends Condiments{
    public Soy(Beverage beverage) {
        super(beverage);
        description = "Soy";
    }

    @Override
    public int cost() {
        return 3 + beverage.cost();
    }
}
