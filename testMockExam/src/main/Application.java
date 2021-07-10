package main;

import java.time.LocalDate;

public class Application {
	public static void main(String[] args) {
		Manager man1 = new Manager("001", "kamala", "harris", LocalDate.of(1989, 1, 1));
		
		Employee emp1 = new Employee("010", "john", "one", LocalDate.of(1990, 1, 1));
		Employee emp2 = new Employee("011", "james", "two", LocalDate.of(1990, 1, 1));
		Employee emp3 = new Employee("012", "sally", "three", LocalDate.of(1990, 1, 1));
		Employee emp4 = new Employee("013", "jane", "four", LocalDate.of(2000, 1, 1));
		Employee emp5 = new Employee("014", "intern", "five", LocalDate.of(2020, 1, 1));
		man1.addEmployee(emp3);
		man1.addEmployee(emp2);
		man1.addEmployee(emp1);
		
		Manager man2 = new Manager("003", "Mike", "Pence", LocalDate.of(1950, 1, 1));
		man2.addEmployee(emp5);
		man1.addEmployee(man2);
		
		Manager CEO = new Manager("002", "Joe", "biden", LocalDate.of(1950, 1, 1));
		CEO.setPosition("CEO");
		CEO.addEmployee(man1);
		CEO.addEmployee(emp4);
		
		//managers
		System.out.println("MANAGERS of "+emp1.getFirstName()+" --> "+emp1.getManagers());
		System.out.println("MANAGERS of "+emp5.getFirstName()+" --> "+emp5.getManagers());
		System.out.println("MANAGERS of "+man1.getFirstName()+" --> "+man1.getManagers());
		System.out.println("MANAGERS of "+CEO.getFirstName()+ " --> "+CEO.getManagers());
		
		//manager using visitor
		GetManagersVisitor manVisitor1 = new GetManagersVisitor();
		emp1.acceptUpwards(manVisitor1);
		System.out.println("MANAGERS2 of "+emp1.getFirstName()+" --> "+manVisitor1.getManagers());
		
		GetManagersVisitor manVisitor2 = new GetManagersVisitor();
		emp5.acceptUpwards(manVisitor2);
		System.out.println("MANAGERS2 of "+emp5.getFirstName()+" --> "+manVisitor2.getManagers());
		
		GetManagersVisitor manVisitor3 = new GetManagersVisitor();
		man1.acceptUpwards(manVisitor3);
		System.out.println("MANAGERS2 of "+man1.getFirstName()+" --> "+manVisitor3.getManagers());
		
		GetManagersVisitor manVisitor4 = new GetManagersVisitor();
		CEO.acceptUpwards(manVisitor4);
		System.out.println("MANAGERS2 of "+CEO.getFirstName()+ " --> "+manVisitor4.getManagers());
		
		//employees
		GetEmployeesVisitor empVisitor = new GetEmployeesVisitor();
		CEO.accept(empVisitor);
		System.out.println("\nEMPLOYEES of "+CEO.getFirstName()+" --> "+empVisitor.getEmployees());
		
		GetEmployeesVisitor empVisitor2 = new GetEmployeesVisitor();
		man1.accept(empVisitor2);
		System.out.println("EMPLOYEES of "+man1.getFirstName()+" --> "+empVisitor2.getEmployees());
		
		//salary
		GetTotalSalary salaryVisitor = new GetTotalSalary();
		man1.accept(salaryVisitor);
		System.out.println("Total salary under "+man1 +" --> "+ salaryVisitor.getSalary());
		
		//team budget
		GetTotalAnnualBudget budgetVisitor = new GetTotalAnnualBudget();
		man1.accept(budgetVisitor);
		System.out.println("Total Team budget of "+man1+" -->"+budgetVisitor.getTeamBudget());
	}

}
