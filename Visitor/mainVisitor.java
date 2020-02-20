package Visitor;

public class mainVisitor
{
    public static void main(String[] args) {
        Visitor visitor1 = new ConcreteVisitor();

        Visitable visitable1 = new VisitableQuestion("Who are you");
        Visitable visitable2 = new VisitableExclamation("Welcome");

        System.out.println(visitable1.accept(visitor1));
        System.out.println(visitable2.accept(visitor1));

    }
}
