package Strategy;

public class Strategy1ToUpperCase implements Strategy {
    @Override
    public String executeAlgorithm(String str) {
        return str.toUpperCase();
    }
}
