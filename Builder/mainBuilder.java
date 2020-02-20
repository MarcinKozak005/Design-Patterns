package Builder;

//Not so sure if it is a correct Builder Pattern, since on the Internet there are plenty of different implementations ...

public class mainBuilder
{
    public static void main(String[] args) {
        Director director = new Director();
        ConcreteBuilder builder1 = new ConcreteBuilder();

        director.setBuilder(builder1);
        director.construct();

        System.out.println(builder1.getProduct().toString());

    }
}
