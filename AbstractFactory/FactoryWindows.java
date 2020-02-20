package AbstractFactory;

public class FactoryWindows implements AbstractFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Sidebar createSidebar() {
        return new WindowsSidebar();
    }
}
