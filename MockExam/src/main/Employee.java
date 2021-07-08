package main;

import java.time.LocalDate;

public class Employee extends EmployeeComponent {

    public Employee(String employeeId, String firstName, String lastName, LocalDate birthDate) {
        super(employeeId, firstName, lastName, birthDate);
        setPosition("Employee");
    }

    @Override
    public void accept(Visitor action) {
        action.visit(this);
    }
}
