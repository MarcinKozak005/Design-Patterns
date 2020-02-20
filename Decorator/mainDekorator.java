package Decorator;

public class mainDekorator {
    public static void main(String[] args) {
        Operation operation = new AddingDecorator(
                new AddingDecorator(new DoubleNumber(2.0),new DoubleNumber(3.0)),
                new DoubleNumber(123));


        System.out.println(operation.calculate());
    }
}
