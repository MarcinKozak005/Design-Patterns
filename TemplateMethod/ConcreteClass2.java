package TemplateMethod;

public class ConcreteClass2 extends AbstractClass {
    @Override
    protected void call1(){
        System.out.println("ConcreteClass2.call1()");
    }

    @Override
    protected void call2() {
        System.out.println("ConcreteClass2.call2() -> modified");
    }
}
