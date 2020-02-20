package AbstractFactory;

public class mainAbstractFactory
{
    public static void main(String[] args) {
        AbstractFactory factory = new FactoryWindows();

        Button button = factory.createButton();
        Sidebar sidebar = factory.createSidebar();

        button.show();
        System.out.println();
        sidebar.show();
    }
}
