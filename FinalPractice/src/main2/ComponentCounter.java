package main2;

import main.ComponentCollector;

public class ComponentCounter extends VisitorChain {
    // TODO
    int count = 0;
    public ComponentCounter(Visitor nextVisitor) {
        super(nextVisitor);
    }
    @Override
    protected void performVisit(Composite composite) {
        // TODO
        ++count;
    }

    @Override
    protected void performVisit(Leaf leaf) {
        // TODO
        ++count;
    }
}
