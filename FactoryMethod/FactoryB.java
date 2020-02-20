package FactoryMethod;

public class FactoryB implements Factory {

    private static int createdOnesInTheRow;

    FactoryB(){
        createdOnesInTheRow = 0;
    }

    @Override
    public Product create()
    {
        System.out.println("Start Business logic for FactoryB");
        if(createdOnesInTheRow!=2){
            createdOnesInTheRow++;
            return new Product1();
        }
        else
        {
            createdOnesInTheRow = 0;
            return new Product2();
        }
    }
}
