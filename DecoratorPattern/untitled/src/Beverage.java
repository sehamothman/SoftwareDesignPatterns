public abstract class Beverage {
    //Component being wrapped!

    protected String description = "";


    public String getDescription(){
        return description;
    }
    public abstract int cost();
}
