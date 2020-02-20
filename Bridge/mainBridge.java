package Bridge;

public class mainBridge
{
    public static void main(String[] args) {
        ConcreteAbstraction concreteAbstraction1 = new ConcreteAbstraction(new Implementation1());
        ConcreteAbstraction concreteAbstraction2 = new ConcreteAbstraction(new Implementation2());

        concreteAbstraction1.AbstractionDrawHouse();
        System.out.println("----------------------");
        concreteAbstraction2.AbstractionDrawHouse();

    }
}
