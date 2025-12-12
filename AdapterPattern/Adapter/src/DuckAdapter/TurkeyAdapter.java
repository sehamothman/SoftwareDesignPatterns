package DuckAdapter;

public class TurkeyAdapter implements Duck{

    //USE TURKEY AS A DUCK!
    Turkey turkey;


    @Override
    public void quack() {
        turkey.gobble();

    }

    @Override
    public void fly() {
        turkey.fly();

    }
}
