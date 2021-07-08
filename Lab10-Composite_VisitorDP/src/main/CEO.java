package main;

public class CEO extends HireComponent{
    protected String name;
    protected HireComponent manager;

    public CEO(String name) {
        this.name = name;
        manager = new Manager(name);
    }

    public void hire(HireComponent directory) {
        manager.add(directory);
    }

    @Override
    void visit(Visitor action) {
        manager.visit(action);
    }
}
