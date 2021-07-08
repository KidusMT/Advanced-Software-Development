package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class Manager extends EmployeeComponent {
    protected Collection<EmployeeComponent> components = new ArrayList<>();
    private double bonus;
    private double teamBudget;

    public Manager(String employeeId, String firstName, String lastName, LocalDate birthDate) {
        super(employeeId, firstName, lastName, birthDate);
        // Default Values
        setPosition("Manager");
        setBonus(getSalary() * .25);
        setTeamBudget(1_000_000);
    }

    public void add(EmployeeComponent component) {
        components.add(component);
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

    @Override
    public void accept(Visitor action) {
        action.visit(this);
        components.forEach(employeeComponent -> employeeComponent.accept(action));
    }
}
