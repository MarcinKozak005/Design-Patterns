package Flyweight;

import java.util.HashMap;

public class FactoryFlyweight
{
    private static HashMap<Integer,Flyweight> theMap = new HashMap<>();

    public static Flyweight getInstance(int num)
    {
        Flyweight x = theMap.get(num);
        if (x==null)
        {
            x = new ConcreteFlyweight(num);
            theMap.put(num,x);
        }
        return x;
    }
}
