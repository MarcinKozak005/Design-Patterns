package State;

public class ConcreteState2 implements State {
    @Override
    public void method1(Context context) {
        System.out.println("Performing CS2.method1() -> -1");
        context.setState(new ConcreteState1());
    }

    @Override
    public void method2(Context context) {
        System.out.println("Performing CS2.method2() -> +1");
        context.setState(new ConcreteState3());
    }
}
