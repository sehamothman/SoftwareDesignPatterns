public class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza = new  Pizza();
        //this part  VARIES!
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }else if (type.equals("greek")){
            pizza = new GreekPizza();
        }

        //THIS PART STAYS THE SAME!
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println(pizza.toString());
        return pizza;

    }

}
