package Proxy;

public class RealSubject implements Subject{

    private String parameter1;

    public RealSubject(String parameter1){
        this.parameter1 = parameter1;
    }

    @Override
    public void operation() {
        System.out.print("RealSubject.operation -> ");
        System.out.println("Performing the heavy operation: "+ parameter1);

    }
}
