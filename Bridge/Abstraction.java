package Bridge;

public abstract class Abstraction
{
    private Implementation implementation;

    public Abstraction(Implementation imp){this.implementation = imp;}

    public void drawSquare()
    {
        implementation.impDrawLine();
        implementation.impDrawLine();
        implementation.impDrawLine();
        implementation.impDrawLine();
        System.out.println();
    }

    public void drawAngle()
    {
        implementation.impDrawLine();
        implementation.impDrawPoint();
        implementation.impDrawLine();
        System.out.println();
    }
}
