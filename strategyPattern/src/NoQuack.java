public class NoQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I do not quack!");
    }
}
