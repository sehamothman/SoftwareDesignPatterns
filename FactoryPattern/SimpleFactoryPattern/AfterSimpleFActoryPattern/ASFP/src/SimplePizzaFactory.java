public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = new  Pizza();
        //this part  VARIES!
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }else if (type.equals("greek")){
            pizza = new GreekPizza();
        }
        System.out.println("Pizza "+pizza.toString());
        return pizza;
    }
}
