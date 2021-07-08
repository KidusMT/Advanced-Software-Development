package main;

import java.util.ArrayList;
import java.util.List;

public class GetManagersAction implements Visitor {
    List<EmployeeComponent> managers = new ArrayList<>();

    @Override
    public void visit(Employee employee) {
    }

    @Override
    public void visit(Manager manager) {
        managers.add(manager);
    }

    public List<EmployeeComponent> getManagers() {
        return managers;
    }
}
