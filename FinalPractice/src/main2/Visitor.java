package main2;

public interface Visitor {
    void visit(Composite composite);
    void visit(Leaf leaf);
}
