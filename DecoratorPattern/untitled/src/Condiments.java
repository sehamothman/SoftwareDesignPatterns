public abstract class Condiments extends Beverage {
    //decorator! to wrap the component!
    protected Beverage beverage;

    public Condiments(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + " +" + description;
    }
    public abstract int  cost();

}
