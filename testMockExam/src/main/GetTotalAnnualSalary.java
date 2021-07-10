package main;

public class GetTotalAnnualSalary implements Visitor{
	double salary = 0.0;
	@Override
	public void visit(Manager m) {		
		salary += m.getSalary()*12 + m.getBonus();	
	}

	@Override
	public void visit(Employee e) {
		salary += e.getSalary()*12;		
	}
	public double getSalary() {
		return salary;
	}	
}
