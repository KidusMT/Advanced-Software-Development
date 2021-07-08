package main;

public class Employee extends HireComponent {
    private final String name;

    public Employee(String newName) {
        name = newName;
    }

    @Override
    public void accept(Visitor action) {
        action.visit(this);
    }

}
