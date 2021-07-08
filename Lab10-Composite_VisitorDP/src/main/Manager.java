package main;

import java.util.ArrayList;
import java.util.Collection;

public class Manager extends HireComponent {
    protected Collection<HireComponent> components = new ArrayList<>();
    private final String name;

    public Manager(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    @Override
    public void visit(Visitor action) {
        action.accept(this);
        components.forEach(hireComponent -> hireComponent.visit(action));
    }

    @Override
    public void add(HireComponent component) {
        components.add(component);
    }
}
