package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class Manager extends HireComponent {
    private String name;
    protected Collection<HireComponent> components = new ArrayList<>();
    public Manager(String newName){
        name = newName;
    }

    public String getName() {
        return name;
    }

    @Override
    public void visit(Visitor action) {
//    public void accept(Consumer<? extends HireComponent> action) {
        action.accept(this);
    }

    @Override
    public void add(HireComponent component) {
        components.add(component);
    }
}
