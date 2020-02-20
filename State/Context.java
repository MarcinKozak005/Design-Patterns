package State;

public class Context {
    State state;

    Context(){
        this.state = new ConcreteState1();
    }

    void setState(State state){
        this.state = state;
    }

    void performAction1(){
        state.method1(this);
    }

    void performAction2(){
        state.method2(this);
    }
}
