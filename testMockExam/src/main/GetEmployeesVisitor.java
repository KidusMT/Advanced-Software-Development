package main;

import java.util.ArrayList;
import java.util.Collection;

public class GetEmployeesVisitor implements Visitor {
	Collection<Employee> employees = new ArrayList<>();
	Employee self;

	@Override
	public void visit(Employee e) {
		if(employees.isEmpty()) { 
			self = e;
		}
		employees.add(e);
	}
	@Override
	public void visit(Manager m) {
		if(employees.isEmpty()) { 
			self = m;
		}
		employees.add(m);	
	}
	public Collection<Employee> getEmployees() {
		employees.remove(self);
		return employees;
	}
}
