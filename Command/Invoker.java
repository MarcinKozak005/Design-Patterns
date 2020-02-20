package Command;

public class Invoker {
    Command command;

    Invoker(Command command){
        this.command = command;
    }

    public void invokeMethod(){
        command.execute();
    }
}
