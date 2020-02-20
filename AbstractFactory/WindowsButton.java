package AbstractFactory;

public class WindowsButton implements Button
{
    @Override
    public void show() {
        System.out.println("/-------------\\");
        System.out.println("|WindowsButton|");
        System.out.println("\\-------------/");
    }

}
