package main;

public class TotalAnnualBudgetVisitor implements Visitor {
	private double total = 0;
	
	public void visit(Employee e) {
		total += e.getAnnualSalary();
	}
	
	public void visit(Manager m) {
		total += m.getAnnualSalary() + m.getTeamBudget();
	}
	
	public double getTotalAnnualBudget() {
		return total;
	}
}
