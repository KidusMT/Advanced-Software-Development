package main2;

import java.util.Iterator;

abstract class Component implements Iterable<Component> {

    public abstract void accept(Visitor v);

    public Iterator<Component> iterator() {
        throw new UnsupportedOperationException();
    }

//    public Iterator<Component> iterator() {
//        if (this instanceof Composite) {
//            ComponentCollector collector = new ComponentCollector();
//            this.accept(collector);
//            return collector.getComponents().iterator();
//        } else {
//            throw  new UnsupportedOperationException();
//        }
//    }
}
