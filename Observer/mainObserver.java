package Observer;

public class mainObserver {
    public static void main(String[] args)
    {
        ConcreteSubject subject = new ConcreteSubject();
        subject.addToList(new ConcreteObserver());

        subject.event();
    }
}
