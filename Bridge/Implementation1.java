package Bridge;

public class Implementation1 implements Implementation {
    @Override
    public void impDrawLine() {
        System.out.println(">> Implementation1.impDrawLine");
    }

    @Override
    public void impDrawPoint() {
        System.out.println(">> Implementation1.impDrawPoint");
    }
}
