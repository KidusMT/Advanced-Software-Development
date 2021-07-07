package main;

import java.util.function.Consumer;

public class Manager extends HireComponent {
    private String name;

    public Manager(String newName){
        name = newName;
    }
    @Override
    public void accept(Consumer<? extends HireComponent> action) {

    }
}
