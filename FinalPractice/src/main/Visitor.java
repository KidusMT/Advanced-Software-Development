package main;

import java.awt.*;

public interface Visitor {
    void visit(Composite composite);
    void visit(Leaf leaf);
}
