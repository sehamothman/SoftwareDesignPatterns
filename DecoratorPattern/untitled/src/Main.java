import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Beverage> order = new ArrayList<>();
        order.add(new Espresso());
        order.add(new Soy(new Decaf()));
        order.add(new Caramel(new Espresso()));

        Beverage bev1 = new Espresso();

        System.out.println(bev1.cost());


        int total = 0;
        for(Beverage bev : order){
            System.out.println(bev.getDescription() + " " + bev.cost() + " TL ");
            total += bev.cost();
        }

        System.out.println("The total cost of the order is :"+total);

    }
}