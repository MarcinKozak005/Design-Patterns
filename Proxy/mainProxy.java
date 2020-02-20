package Proxy;

public class mainProxy
{
    public static void main(String[] args) {

        Subject subject = new Proxy("Argument");

        subject.operation();
    }
}
