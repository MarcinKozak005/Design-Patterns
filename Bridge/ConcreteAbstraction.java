package Bridge;

public class ConcreteAbstraction extends Abstraction {
    public ConcreteAbstraction(Implementation imp) {
        super(imp);
    }

    void AbstractionDrawHouse()
    {
        drawAngle(); //roof
        drawSquare(); // building
        drawSquare(); // door
    }
}
