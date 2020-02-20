package Strategy;

public class Context {
    String str;
    Strategy strategy;

    Context(String str, Strategy strategy){
        this.str = str;
        this.strategy = strategy;
    }

    public void executeStrategy(){
        System.out.println("Selected strategy resulted in: "+strategy.executeAlgorithm(str));
    }

}
