package Strategy;

public class Strategy2ToLowerCase implements Strategy {
    @Override
    public String executeAlgorithm(String str) {
        return str.toLowerCase();
    }
}
