package Adapter;

public class Adapter {
    Adapted adaptedElement;

    Adapter(Adapted obj){adaptedElement = obj;}

    void newOperation(){
        this.adaptedElement.oldOperation();
    }
}
