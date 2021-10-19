package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class BoxComponent implements Component {
    private List<Component> components = new ArrayList<Component>();

    public void addComponent(Component component){
        components.add(component);
    }

    public void removeComponent(Component component){
        int indexComponent = components.indexOf( component);
        components.remove(indexComponent);
    }

    @Override
    public void doJob() {
        components.forEach(component -> component.doJob());
    }

    @Override
    public void makeNet() {
        components.forEach(component -> component.makeNet());
    }
}
