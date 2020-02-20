package Strategy;

public class mainStrategy {

    public static void main(String[] args) {

        Context context1 = new Context("aLa Ma SuPeR kOtA", new Strategy1ToUpperCase());
        Context context2 = new Context("aLa Ma SuPeR kOtA", new Strategy2ToLowerCase());

        context1.executeStrategy();
        context2.executeStrategy();

    }
}
