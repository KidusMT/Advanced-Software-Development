package main;

import java.time.LocalDate;

public class CEO extends EmployeeComponent{
    protected EmployeeComponent manager;
    private double bonus;
    private double teamBudget;
    public CEO(String employeeId, String firstName, String lastName, LocalDate birthDate) {
        super(employeeId, firstName, lastName, birthDate);
        setPosition("Manager");
        setBonus(getSalary() * 0.25);
        setTeamBudget(1_000_000);
        manager = new Manager(employeeId, firstName, lastName, birthDate);
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

    public void hire(EmployeeComponent directory) {
        manager.add(directory);
    }

    @Override
    void accept(Visitor action) {
        manager.accept(action);
    }
}
