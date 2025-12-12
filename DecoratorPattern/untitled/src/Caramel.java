public class Caramel extends Condiments{

    public Caramel(Beverage beverage) {
        super(beverage);
        description = "Caramel";
    }

    @Override
    public int cost() {
        return 4+ beverage.cost();
    }
}
