package main;

import java.util.ArrayList;
import java.util.List;

public class GetEmployeeAction implements Visitor {
    List<Employee> employeeComponents = new ArrayList<>();

    @Override
    public void visit(Employee employee) {
        employeeComponents.add(employee);
    }

    @Override
    public void visit(Manager manager) {
        employeeComponents.add(manager);
    }

    public List<Employee> getEmployeeUnderManager() {
        return employeeComponents;
    }
}
