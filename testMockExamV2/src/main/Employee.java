package main;

import java.time.LocalDate;

public class Employee {

	private String employeeId;

	private String firstName;

	private String lastName;

	private LocalDate birthDate;

	private LocalDate startDate;

	private Double salary;

	private String position;
	
	private Manager manager;

	public Employee(String employeeId, String firstName, String lastName, double salary, LocalDate birthDate) {

		super();

		this.employeeId = employeeId;

		this.firstName = firstName;

		this.lastName = lastName;

		this.birthDate = birthDate;

// Default Values

		this.startDate = LocalDate.now();

		this.salary = salary;

		this.position = "Employee";

	}

	public String getEmployeeId() {

		return employeeId;

	}

	public void setEmployeeId(String employeeId) {

		this.employeeId = employeeId;

	}

	public String getFirstName() {

		return firstName;

	}

	public void setFirstName(String firstName) {

		this.firstName = firstName;

	}

	public String getLastName() {

		return lastName;

	}

	public void setLastName(String lastName) {

		this.lastName = lastName;

	}

	public LocalDate getBirthDate() {

		return birthDate;

	}

	public void setBirthDate(LocalDate birthDate) {

		this.birthDate = birthDate;

	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public LocalDate getStartDate() {

		return startDate;

	}

	public void setStartDate(LocalDate startDate) {

		this.startDate = startDate;

	}

	public Double getSalary() {

		return salary;

	}

	public void setSalary(Double salary) {

		this.salary = salary;

	}

	public String getPosition() {

		return position;

	}

	public void setPosition(String position) {

		this.position = position;

	}
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public void acceptUpwards(Visitor visitor) {
		if (manager != null) {
			visitor.visit(manager);
			manager.acceptUpwards(visitor);
		}
	}
	
	public double getAnnualSalary() {
		return salary * 12;
	}

}