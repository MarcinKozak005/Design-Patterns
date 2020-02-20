package ChainOfResponsibility;

public abstract class Handler {
    Handler nextHandler;

    void setNextHandler(Handler handle)
    {
        nextHandler = handle;
    }
    public abstract void handleInput(String str);

}
