package main;

import java.util.function.Consumer;

public abstract class HireComponent {
    public abstract void accept(Consumer<? extends HireComponent> action);
}
