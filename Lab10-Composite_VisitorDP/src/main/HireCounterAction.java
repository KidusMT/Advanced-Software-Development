package main;

public class HireCounterAction implements Visitor {
    int count = 0;

    @Override
    public void accept(Employee employee) {
        ++count;
    }

    @Override
    public void accept(Manager manager) {
        ++count;
    }

    public int getCount() {
        return count;
    }
}
