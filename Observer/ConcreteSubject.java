package Observer;

import java.util.LinkedList;
import java.util.List;

public class ConcreteSubject
{
    private List<Observer> observerList;

    ConcreteSubject(){
        observerList = new LinkedList<>();
    }

    public void addToList(Observer obs)
    {
        observerList.add(obs);
    }

    public void event()
    {
        for (Observer obs:observerList)
        {
            obs.update();
        }
    }
}
