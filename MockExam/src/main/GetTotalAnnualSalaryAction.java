package main;

public class GetTotalAnnualSalaryAction implements Visitor {
    int totalAnnualSalary = 0;

    @Override
    public void visit(Employee employee) {
        totalAnnualSalary += (12 *employee.getSalary());
    }

    @Override
    public void visit(Manager manager) {
//        12 * salary + bonus
        totalAnnualSalary += (12 * (manager.getSalary() + manager.getBonus()));
    }

    public int getTotalAnnualSalary() {
        return totalAnnualSalary;
    }
}
