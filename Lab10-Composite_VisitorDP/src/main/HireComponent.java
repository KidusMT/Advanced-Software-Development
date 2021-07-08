package main;

public abstract class HireComponent {
    abstract void accept(Visitor action);
    public void add(HireComponent component){
        throw new UnsupportedOperationException();
    }
}
