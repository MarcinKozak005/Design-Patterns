package AbstractFactory;

public class LinuxButton implements Button {
    @Override
    public void show() {
        System.out.println("IIIIIIIIIIIIIII");
        System.out.println(">>LinuxButton<<");
        System.out.println("IIIIIIIIIIIIIII");
    }
}
