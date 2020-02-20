package Decorator;

public class DoubleNumber implements Operation {
    private double value;

    DoubleNumber(double value){this.value = value;}

    @Override
    public double calculate() {
        return value;
    }
}
