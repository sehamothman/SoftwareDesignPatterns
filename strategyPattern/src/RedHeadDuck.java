public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Hi! It's Red Head Duck");
    }
}
