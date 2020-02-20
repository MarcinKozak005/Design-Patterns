package Component;

public class Leaf implements Component
{
    private int value;

    Leaf(int value){this.value = value;}

    @Override
    public void operation()
    {
        System.out.println(value);
    }
}
