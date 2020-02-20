package State;

public class ConcreteState1 implements State {

    @Override
    public void method1(Context context) {
        System.out.println("Performing CS1.method1() -> -1");
        context.setState(new ConcreteState3());

    }

    @Override
    public void method2(Context context) {
        System.out.println("Performing CS1.method2() -> +1");
        context.setState(new ConcreteState2());
    }
}
