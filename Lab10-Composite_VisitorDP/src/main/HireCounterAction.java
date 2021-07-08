package main;

public class HireCounterAction implements Visitor{
    int count = 0;
    @Override
    public void accept(Employee employee) {
        ++count;
    }

    @Override
    public void accept(Manager manager) {
        System.out.println(manager.getName());
        ++count;
        manager.components.forEach(hireComponent -> hireComponent.visit(this));
    }

    public int getCount(){
        return count;
    }
}
