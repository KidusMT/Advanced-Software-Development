package main;

public class HireCounterAction implements Visitor {
    int count = 0;

    @Override
    public void visit(Employee employee) {
        ++count;
    }

    @Override
    public void visit(Manager manager) {
        ++count;
    }

    public int getCount() {
        return count;
    }
}
