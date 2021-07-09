package main2;

import java.util.Collection;
import java.util.LinkedList;

public class ComponentCollector implements Visitor {
    private final Collection<Component> components = new LinkedList<>();

    @Override
    public void visit(Composite composite) {
        components.add(composite);
    }

    @Override
    public void visit(Leaf leaf) {
        components.add(leaf);
    }

    public Collection<Component> getComponents() {
        return components;
    }
}
