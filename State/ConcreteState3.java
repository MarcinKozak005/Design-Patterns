package State;

public class ConcreteState3 implements State{
    @Override
    public void method1(Context context) {
        System.out.println("Performing CS3.method1() -> -1");
        context.setState(new ConcreteState2());
    }

    @Override
    public void method2(Context context) {
        System.out.println("Performing CS3.method2() -> +1");
        context.setState(new ConcreteState1());
    }
}
