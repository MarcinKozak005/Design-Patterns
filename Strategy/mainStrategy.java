package Strategy;

public class mainStrategy {

    public static void main(String[] args) {

        Context context1 = new Context("aLa HaS a SuPeR cAt", new Strategy1ToUpperCase());
        Context context2 = new Context("aLa HaS a SuPeR cAt", new Strategy2ToLowerCase());

        context1.executeStrategy();
        context2.executeStrategy();

    }
}
