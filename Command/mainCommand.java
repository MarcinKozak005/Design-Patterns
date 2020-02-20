package Command;

public class mainCommand {
    public static void main(String[] args) {

        // creating a receiver (of the called method/ on which the method will be called)
        ConcreteReceiver receiver = new ConcreteReceiver();

        // creating a method
        Command commandMethod1 = new ConcreteCommand1(receiver, 12, "example_string1");

        // Invoker for a method
        Invoker invoker = new Invoker(commandMethod1);

        invoker.invokeMethod();
    }
}
