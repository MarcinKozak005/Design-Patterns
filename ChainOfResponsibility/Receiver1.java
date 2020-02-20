package ChainOfResponsibility;

public class Receiver1 extends Handler {

    @Override
    public void handleInput(String str) {
        if(str.equals("1"))
            System.out.println("Request1 handled");
        else
            nextHandler.handleInput(str);
    }
}
