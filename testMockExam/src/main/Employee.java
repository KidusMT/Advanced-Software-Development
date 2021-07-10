package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class Employee {
	private String employeeId;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private LocalDate startDate;
	private Double salary;
	private String position;
	
	private Manager manager;

	public Employee(String employeeId, String firstName, String lastName, LocalDate birthDate) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		// Default Values
		this.startDate = LocalDate.now();
		this.salary = 1000.0;
		this.position = "Employee";
	}
	
	public Collection<Manager> getManagers() {
		Collection<Manager> managerList = new ArrayList<>();
		if(manager!=null) {
			managerList.add(manager);
			manager.getManagers().forEach(m->managerList.add(m));
		}	
		return managerList;
	}
	public void accept(Visitor visitor) {
		visitor.visit(this);		
	}
	public void acceptUpwards(Visitor visitor) {
		if(manager!=null) {
			visitor.visit(this.manager);
			this.manager.acceptUpwards(visitor);
		}
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public Double getSalary() {
		return salary;
	}

	public String getPosition() {
		return position;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}
	@Override
	public String toString() {
		return this.position+ " : "+ this.firstName+" "+ this.lastName;
	}
}
