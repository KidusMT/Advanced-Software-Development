package main2;

public abstract class VisitorChain implements Visitor {
    //TODO
    private Visitor nextVisitor;
    public VisitorChain(Visitor nextVisitor) {
        super();
        this.nextVisitor = nextVisitor;
    }
    public void visit(Composite composite) {
        performVisit(composite);
            //TODO
        nextVisitor.visit(composite);
    }
    public void visit(Leaf leaf) {
        performVisit(leaf);
            // TODO
        nextVisitor.visit(leaf);
    }
    // template method part.. where the steps are defined in the
    protected abstract void performVisit(Leaf leaf);
    protected abstract void performVisit(Composite composite);
//    public Visitor getNextVisitor(){
//        return nextVisitor;
//    }
}
