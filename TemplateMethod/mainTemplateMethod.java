package TemplateMethod;

public class mainTemplateMethod
{
    public static void main(String[] args) {

        ConcreteClass1 class1 = new ConcreteClass1();
        ConcreteClass2 class2 = new ConcreteClass2();

        class1.generalMethod();
        System.out.println();
        class2.generalMethod();

    }
}
