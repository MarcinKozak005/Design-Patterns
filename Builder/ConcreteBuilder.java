package Builder;

//Not so sure if it is a correct Builder Pattern, since on the Internet there are plenty of different implementations ...
public class ConcreteBuilder implements Builder {
    private Product product;

    ConcreteBuilder(){product = new Product();}

    @Override
    public void buildPart1() {
        product.setName("Ala");
    }

    @Override
    public void buildPart2() {
        product.setAge(12);
    }

    @Override
    public void buildPart3() {
        product.setHeight(170.5);
    }

    Product getProduct()
    {
        return product;
    }
}
