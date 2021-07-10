package main;

public class TotalSalaryVisitor implements Visitor {
	private double total = 0;
	
	public void visit(Employee e) {
		total += e.getSalary();
	}
	
	public void visit(Manager m) {
		total += m.getSalary();
	}
	
	public double getTotalSalary() {
		return total;
	}
}
