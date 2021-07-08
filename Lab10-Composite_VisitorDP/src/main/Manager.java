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
    public void accept(Visitor action) {
        action.visit(this);
        components.forEach(hireComponent -> hireComponent.accept(action));
    }

    @Override
    public void add(HireComponent component) {
        components.add(component);
    }
}
