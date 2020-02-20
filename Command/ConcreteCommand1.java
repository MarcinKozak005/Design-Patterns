package Command;

public class ConcreteCommand1 implements Command {

    ConcreteReceiver receiver; //works only for ConcreteReceiver. We can add an interface ex. Receiver and make all ConcreteReceivers implement it.
    int parameter1;
    String parameter2;

    ConcreteCommand1(ConcreteReceiver receiver,int parameter1, String parameter2){
        this.receiver = receiver;
        this.parameter1 = parameter1;
        this.parameter2 = parameter2;
    }

    @Override
    public void execute() {
        receiver.method1(parameter1, parameter2);
    }
}
