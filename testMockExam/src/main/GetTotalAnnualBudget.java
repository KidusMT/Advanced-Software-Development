package main;

public class GetTotalAnnualBudget implements Visitor{
	double teamBudget = 0.0;
	@Override
	public void visit(Manager m) {
		teamBudget += m.getTeamBudget() + m.getSalary()*12+ m.getBonus();	
	}

	@Override
	public void visit(Employee e) {	
		teamBudget+= e.getSalary()*12;
	}

	public double getTeamBudget() {
		return teamBudget;
	}

}
