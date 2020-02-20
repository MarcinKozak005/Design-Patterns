package Builder;

//Not so sure if it is a correct Builder Pattern, since on the Internet there are plenty of different implementations ...
public class Product
{
    private String name;
    private int age;
    private double height;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString()
    {
        return (name+" "+age+" "+height);
    }
}
