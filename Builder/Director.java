package Builder;

//Not so sure if it is a correct Builder Pattern, since on the Internet there are plenty of different implementations ...
public class Director
{
    private Builder builder;

    void setBuilder(Builder builder){
        this.builder = builder;
    }

    void construct()
    {
        builder.buildPart1();
        builder.buildPart2();
        builder.buildPart3();
    }
}
