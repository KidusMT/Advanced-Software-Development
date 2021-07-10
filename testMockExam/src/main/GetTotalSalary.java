package main;

public class GetTotalSalary implements Visitor{
	double salary = 0.0;
	@Override
	public void visit(Manager m) {		
		salary += m.getSalary();	
	}

	@Override
	public void visit(Employee e) {
		salary += e.getSalary();		
	}

	public double getSalary() {
		return salary;
	}	
}
