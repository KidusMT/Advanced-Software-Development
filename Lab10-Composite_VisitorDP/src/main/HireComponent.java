package main;

public abstract class HireComponent {
    //    public abstract void accept(Consumer<? extends HireComponent> action);
    abstract void visit(Visitor action);
    public void add(HireComponent component){
        throw new UnsupportedOperationException();
    }
}
