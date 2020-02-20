package ChainOfResponsibility;

public class Receiver2 extends Handler {

    @Override
    public void handleInput(String str) {
        if(str.equals("2"))
            System.out.println("Request2 handled");
        else
            nextHandler.handleInput(str);
    }
}
