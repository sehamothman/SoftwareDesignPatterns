public class ChicagoPizzaStore extends  PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = new Pizza();
        //this part  VARIES!
        if (type.equals("CHcheese")) {
            pizza = new ChStyleCheesePizza();
        } else if (type.equals("CHpepperoni")) {
            pizza = new ChStylePepperoniPizza();
        } else if (type.equals("CHveggie")) {
            pizza = new ChStyleVeggiePizza();
        }
        System.out.println("Pizza " + pizza.toString());
        return pizza;
    }
}
