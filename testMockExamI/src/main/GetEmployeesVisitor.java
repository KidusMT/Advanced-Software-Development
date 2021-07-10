package main;

import java.util.*;

public class GetEmployeesVisitor implements Visitor {
	List<Employee> employees = new ArrayList<Employee>();

	@Override
	public void visit(Employee e) {
		employees.add(e);
	}

	@Override
	public void visit(Manager m) {
		employees.add(m);
	}
	
	public List<Employee> getEmployees() {
		return employees;
	}

}
