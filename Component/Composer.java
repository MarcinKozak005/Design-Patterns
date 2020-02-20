package Component;

import java.util.LinkedList;
import java.util.List;

public class Composer implements Component {

    List<Component> componentsList;

    Composer() {componentsList = new LinkedList<Component>();}

    void add(Component component){componentsList.add(component);}
    void remove(Component component){componentsList.remove(component);}

    @Override
    public void operation() {
        for(Component component: componentsList)
        {
            component.operation();
        }
    }
}
