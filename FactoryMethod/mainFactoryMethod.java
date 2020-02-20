package FactoryMethod;

public class mainFactoryMethod
{
    public static void main(String[] args)
    {
        Factory f1 = new FactoryA();
        Factory f2 = new FactoryB();

        System.out.print("1. call of f1: ");
        f1.create().introduceYourself();
        System.out.print("2. call of f1: ");
        f1.create().introduceYourself();
        System.out.print("3. call of f1: ");
        f1.create().introduceYourself();
        System.out.println("---------------");
        System.out.print("1. call of f2: ");
        f2.create().introduceYourself();
        System.out.print("2. call of f2: ");
        f2.create().introduceYourself();
        System.out.print("3. call of f2: ");
        f2.create().introduceYourself();


    }
}
