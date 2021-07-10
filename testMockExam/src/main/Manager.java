package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class Manager extends Employee {
	Collection<Employee> employees = new ArrayList<>();
	private double bonus = 8000;
	private double teamBudget = 10000;

	public Manager(String employeeId, String firstName, String lastName, LocalDate birthDate) {
		super(employeeId, firstName, lastName, birthDate);
		this.setPosition("Manager");
	}
	void addEmployee(Employee e) {
		e.setManager(this);
		employees.add(e);
	}
	
	public Collection<Employee> getEmployees(){
		Collection<Employee> employees = new ArrayList<>();
		
		
		return employees;
	}
//	@Override
//	public Double getSalary() {
//		return this.getSalary()+bonus;
//	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getTeamBudget() {
		return teamBudget;
	}
	public void setTeamBudget(double teamBudget) {
		this.teamBudget = teamBudget;
	}
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		employees.forEach(e->e.accept(visitor));
	}

}
