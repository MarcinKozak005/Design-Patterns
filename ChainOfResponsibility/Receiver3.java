package ChainOfResponsibility;

public class Receiver3 extends Handler {

    @Override
    public void handleInput(String str) {
        if(str.equals("3"))
            System.out.println("Request3 handled");
        else
            nextHandler.handleInput(str);
    }
}
