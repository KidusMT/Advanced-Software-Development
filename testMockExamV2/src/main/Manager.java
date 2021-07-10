package main;

import java.time.LocalDate;
import java.util.*;

public class Manager extends Employee {
	
	private double bonus;
	private double teamBudget;
	private List<Employee> team;

	public Manager(String employeeId, String firstName, String lastName, double salary, LocalDate birthDate, double bonus, double teamBudget) {
		super(employeeId, firstName, lastName, salary, birthDate);
		
		this.bonus = bonus;
		this.teamBudget = teamBudget;
		
		this.team = new ArrayList<Employee>();
	}

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

	public void addTeamMember(Employee e) {
		this.team.add(e);
//		e.setManager(this);
	}
	
	public List<Employee> getTeam() {
		return this.team;
	}
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
		team.forEach(e -> e.accept(visitor));
	}
	
	public double getAnnualSalary() {
		return getSalary() * 12 + bonus;
	}
}
