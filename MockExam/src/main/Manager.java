package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Manager extends Employee {
    private double bonus;
    private double teamBudget;
    private List<Employee> teamMembers = new ArrayList<>();

    public Manager(String employeeId, String firstName, String lastName, LocalDate birthDate) {
        super(employeeId, firstName, lastName, birthDate);
        // Default Values
        setPosition("Manager");
        setBonus(getSalary() * .25);
        setTeamBudget(1_000_000);
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

    public void addTeamMember(Employee employee){
        teamMembers.add(employee);
        employee.setManager(this);
    }

    public List<Employee> getTeamMembers(){
        return teamMembers;
    }

    @Override
    public void accept(Visitor action) {
        action.visit(this);
        teamMembers.forEach(e -> e.accept(action));
    }
}
