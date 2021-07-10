package main;

public class TotalAnnualSalaryVisitor implements Visitor {
	private double total = 0;
	
	public void visit(Employee e) {
		total += e.getAnnualSalary();
	}
	
	public void visit(Manager m) {
		visit((Employee) m);
	}
	
	public double getTotalAnnualSalary() {
		return total;
	}
}
