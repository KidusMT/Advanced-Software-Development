package main;

public class CEO {
    protected String name;
    protected HireComponent manager;

    public CEO(String name) {
        this.name = name;
        manager = new Manager(name);
    }

}
