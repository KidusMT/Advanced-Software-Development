package main;

import java.util.Iterator;

abstract class Component implements Iterable<Component> {

    public abstract void accept(Visitor v);

    public Iterator<Component> iterator() {
        throw new UnsupportedOperationException();
    }
}
