package Decorator;

public abstract class Decorator implements Operation{
    Operation first;

    Decorator(Operation first){this.first = first;}

    @Override
    public double calculate() {
        return first.calculate();
    }
}
