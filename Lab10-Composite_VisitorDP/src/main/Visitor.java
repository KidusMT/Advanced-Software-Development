package main;

public interface Visitor {
    void accept(Employee employee);
    void accept(Manager manager);
}
