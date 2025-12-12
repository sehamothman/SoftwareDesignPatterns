public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = new Pizza();
        //this part  VARIES!
        if (type.equals("NYcheese")) {
            pizza = new NYStyleCheesePizza();
            System.out.println("NYcheese Pizza Created");
        } else if (type.equals("NYpepperoni")) {
            pizza = new NYStylePepperoniPizza();
        } else if (type.equals("NYveggie")) {
            pizza = new NYStyleVeggiePizza();
        }
        System.out.println("Pizza " + pizza.toString());
        return pizza;
    }
}
