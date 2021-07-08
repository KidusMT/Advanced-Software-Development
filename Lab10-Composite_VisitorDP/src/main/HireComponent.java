package main;

public abstract class HireComponent {
    abstract void visit(Visitor action);
    public void add(HireComponent component){
        throw new UnsupportedOperationException();
    }
}
