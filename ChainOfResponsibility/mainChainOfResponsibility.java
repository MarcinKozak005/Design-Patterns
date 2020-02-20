package ChainOfResponsibility;

public class mainChainOfResponsibility
{
    public static void main(String[] args)
    {
        Handler handler1 = new Receiver1();
        Handler handler2 = new Receiver2();
        Handler handler3 = new Receiver3();


        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        handler1.handleInput("2");

    }
}
