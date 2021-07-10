package main2;

import java.util.Iterator;

abstract class Component implements Iterable<Component> {

    public abstract void accept(Visitor v);

    public Iterator<Component> iterator() {
        ComponentCollector v = new ComponentCollector();
        this.accept(v);
        return v.getComponents().iterator();
    }
}
