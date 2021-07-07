package main;

import java.util.function.Consumer;

public class Employee extends HireComponent {
    private String name;

    public Employee(String newName){
        name = newName;
    }

    @Override
    public void accept(Consumer<? extends HireComponent> action) {

    }
}
