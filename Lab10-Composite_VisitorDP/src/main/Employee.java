package main;

public class Employee extends HireComponent {
    private final String name;

    public Employee(String newName) {
        name = newName;
    }

    @Override
    public void visit(Visitor action) {
        action.accept(this);
    }

}
