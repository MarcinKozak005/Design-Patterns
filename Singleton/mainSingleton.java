package Singleton;

public class mainSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(System.identityHashCode(singleton));

        Singleton newSingleton = Singleton.getInstance();
        System.out.println(System.identityHashCode(singleton));
    }
}
