package main2;

import java.util.Iterator;

abstract class Component implements Iterable<Component> {

    public abstract void accept(Visitor v);

    public Iterator<Component> iterator() {
        throw new UnsupportedOperationException();
//        ComponentCollector componentCollector = new ComponentCollector();
//        this.accept(componentCollector);
//        return componentCollector.getComponents().iterator();
    }
}
