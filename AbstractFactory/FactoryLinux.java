package AbstractFactory;

public class FactoryLinux implements AbstractFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Sidebar createSidebar() {
        return new LinuxSidebar();
    }
}
