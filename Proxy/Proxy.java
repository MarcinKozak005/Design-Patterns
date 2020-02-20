package Proxy;

public class Proxy implements Subject{
    private RealSubject realSubject;
    private String proxyParameter;

    public Proxy(String proxyParameter)
    {
        this.proxyParameter = proxyParameter;
    }

    @Override
    public void operation() {
        if(this.realSubject == null)
            this.realSubject = new RealSubject(proxyParameter);

        this.realSubject.operation();
    }
}
