package main;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Manager ceo = new Manager("174832", "John", "Doe", 10000, LocalDate.of(1960, 1, 4), 12000, 30000);

		Manager hr = new Manager("182376", "Laura", "Klitz", 4500, LocalDate.of(1982, 4, 18), 6000, 24000);
		
		Employee rec = new Employee("444732", "Derek", "Skie", 4000, LocalDate.of(1990, 7, 6));
		Employee acc = new Employee("323214", "Bill", "Simons", 4000, LocalDate.of(1978, 3, 21));
		
		Manager pm = new Manager("382914", "Frank", "Logan", 6000, LocalDate.of(1988, 2, 13), 8000, 12000);
		
		Employee dev1 = new Employee("849312", "Jeremy", "Norton", 5000, LocalDate.of(1994, 8, 6));
		Employee dev2 = new Employee("382713", "Elisa", "Jones", 5000, LocalDate.of(1998, 1, 30));
		
		ceo.addTeamMember(hr);
		ceo.addTeamMember(pm);
		pm.setManager(ceo);
		hr.setManager(ceo);
		
		hr.addTeamMember(rec);
		hr.addTeamMember(acc);
		rec.setManager(hr);
		acc.setManager(hr);
		
		pm.addTeamMember(dev1);
		pm.addTeamMember(dev2);
		dev1.setManager(pm);
		dev2.setManager(pm);
		
		GetManagersVisitor mv = new GetManagersVisitor();
		dev2.accept(mv);

		System.out.println("Elisa Jones' managers:");
		mv.getManagers().forEach(e -> System.out.println(e.getFirstName() +  " " + e.getLastName()));
		
		System.out.println();
		
		GetEmployeesVisitor v = new GetEmployeesVisitor();
		ceo.accept(v);
		
		System.out.println("John Doe's employees:");
		v.getEmployees().forEach(e -> System.out.println(e.getFirstName() +  " " + e.getLastName()));
		
		System.out.println();
		
		TotalSalaryVisitor v1 = new TotalSalaryVisitor();
		pm.accept(v1);

		System.out.println("Frank Logan's salary (+subordinates): " + v1.getTotalSalary());
		
		System.out.println();
		
		TotalAnnualSalaryVisitor v2 = new TotalAnnualSalaryVisitor();
		hr.accept(v2);

		System.out.println("Laura Klitz' annual salary (+subordinates): " + v2.getTotalAnnualSalary());
		
		System.out.println();
		
		TotalAnnualBudgetVisitor v3 = new TotalAnnualBudgetVisitor();
		ceo.accept(v3);

		System.out.println("John Doe's annual budget (+subordinates): " + v3.getTotalAnnualBudget());
		
	}

}
