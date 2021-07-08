package main;

public class Employee extends HireComponent {
    private final String name;

    public Employee(String newName) {
        name = newName;
    }

    @Override
    public void visit(Visitor action) {
//    public void accept(Consumer<? extends HireComponent> action) {
        action.accept(this);
    }

}
