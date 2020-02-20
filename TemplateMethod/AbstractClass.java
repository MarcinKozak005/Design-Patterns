package TemplateMethod;

public abstract class AbstractClass
{
    public final void generalMethod()
    {
        callStart();
        call1();
        call2();
        call3();
        callEnd();
    }

    // non-modifiable method
    private void callStart(){
        System.out.println("Starting the sequence ...");
    }

    // must be implemented in inherited class
    protected abstract void call1();

    // can be implemented
    protected void call2(){
        System.out.println("Default call2()");
    }

    // can be implemented
    protected void call3(){
        System.out.println("Default call3()");
    }

    // non-modifiable method
    private void callEnd(){
        System.out.println("Ending the sequence ...");
    }
}
