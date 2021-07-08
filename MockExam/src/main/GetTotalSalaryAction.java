package main;

public class GetTotalSalaryAction implements Visitor {
    int totalSalary = 0;

    @Override
    public void visit(Employee employee) {
        totalSalary += employee.getSalary();
    }

    @Override
    public void visit(Manager manager) {
        totalSalary += manager.getSalary() + manager.getBonus();
    }

    public int getTotalSalary() {
        return totalSalary;
    }
}
