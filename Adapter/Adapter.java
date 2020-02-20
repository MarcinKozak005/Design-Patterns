package Adapter;

public class Adapter {
    Adapted elemAdaptowany;

    Adapter(Adapted obiekt){elemAdaptowany = obiekt;}

    void newOperation(){
        this.elemAdaptowany.oldOperation();
    }
}
