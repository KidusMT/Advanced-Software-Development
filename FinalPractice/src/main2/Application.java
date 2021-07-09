package main2;

public class Application {

    public static void main(String[] args) {
        Component component1 = new Composite();
        Component component2 = new Composite();
        Component component3 = new Composite();

        Component leaf1 = new Leaf();
        Component leaf2 = new Leaf();
        Component leaf3 = new Leaf();
        Component leaf4 = new Leaf();
        ((Composite)component1).addComponent(component2);
        ((Composite)component1).addComponent(leaf1);
        ((Composite)component2).addComponent(leaf2);
        ((Composite)component2).addComponent(component3);
        ((Composite)component3).addComponent(leaf3);
        ((Composite)component3).addComponent(leaf4);

        ComponentCollector collectorVisitor = new ComponentCollector();
        ComponentCounter counterVisitor = new ComponentCounter(collectorVisitor);
        component1.accept(counterVisitor);

        System.out.println(counterVisitor.count);
        System.out.println(collectorVisitor.getComponents());
    }
}
