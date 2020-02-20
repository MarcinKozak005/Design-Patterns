package FactoryMethod;

public class FactoryA implements Factory {

    private static boolean lastCreated1;

    FactoryA(){
        lastCreated1 = false;
    }

    @Override
    public Product create()
    {
        System.out.println("Start Business logic for FactoryA");
        if(lastCreated1){
            lastCreated1 = false;
            return new Product1();
        }
        else
        {
            lastCreated1 = true;
            return new Product2();
        }
    }
}
