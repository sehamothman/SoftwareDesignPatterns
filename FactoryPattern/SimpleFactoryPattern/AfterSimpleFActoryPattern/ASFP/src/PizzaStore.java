public class PizzaStore {
    SimplePizzaFactory factory;
    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = new Pizza();
        //Creation of pizza is delegated to factory.
        pizza = factory.createPizza(type);
        //THIS PART STAYS THE SAME!
        pizza.prepare();
        System.out.println("pizza prep done!");
        pizza.bake();
        System.out.println("pizza bake done!");
        pizza.cut();
        System.out.println("pizza cut done!");
        pizza.box();
        System.out.println("pizza box done!");
        System.out.println(pizza.toString());
        return pizza;

    }

}
