package Decorator;

public class AddingDecorator extends Decorator {
    Operation second;

    AddingDecorator(Operation first, Operation second) {
        super(first);
        this.second = second;
    }

    @Override
    public double calculate() {
        return super.first.calculate() + second.calculate();
    }
}
