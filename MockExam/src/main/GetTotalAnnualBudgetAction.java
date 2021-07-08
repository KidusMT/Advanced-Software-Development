package main;

public class GetTotalAnnualBudgetAction implements Visitor {
    int totalAnnualBudget = 0;

    @Override
    public void visit(Employee employee) {
        totalAnnualBudget += (12 * employee.getSalary());
    }

    @Override
    public void visit(Manager manager) {
//        (12 * salary + bonus) + team budget
        totalAnnualBudget += ((12 * (manager.getSalary() + manager.getBonus())) + manager.getTeamBudget());
    }

    public int getTotalAnnualBudget() {
        return totalAnnualBudget;
    }
}
