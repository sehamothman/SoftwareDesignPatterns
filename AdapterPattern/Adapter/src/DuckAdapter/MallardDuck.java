package DuckAdapter;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Mallard Duck Quack Quack");
    }

    @Override
    public void fly() {
        System.out.println("Mallard Duck flying");

    }
}
