package Flyweight;

public class mainFlyweight
{
    public static void main(String[] args)
    {
        Flyweight x1 =FactoryFlyweight.getInstance(2);
        Flyweight x2 =FactoryFlyweight.getInstance(13);
        Flyweight x3 =FactoryFlyweight.getInstance(11);
        Flyweight x4 =FactoryFlyweight.getInstance(2);

        System.out.println(x1.hashCode());
        System.out.println(x2.hashCode());
        System.out.println(x3.hashCode());
        System.out.println(x4.hashCode());




    }
}
