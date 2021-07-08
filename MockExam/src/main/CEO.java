package main;

import java.time.LocalDate;

public class CEO extends EmployeeComponent{
    protected EmployeeComponent manager;

    public CEO(String employeeId, String firstName, String lastName, LocalDate birthDate) {
        super(employeeId, firstName, lastName, birthDate);
        setPosition("Manager");
        manager = new Manager(employeeId, firstName, lastName, birthDate);
    }

    public void hire(EmployeeComponent directory) {
        manager.add(directory);
    }

    @Override
    void accept(Visitor action) {
        manager.accept(action);
    }
}
