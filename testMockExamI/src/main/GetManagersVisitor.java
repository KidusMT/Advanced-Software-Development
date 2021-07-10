package main;

import java.util.ArrayList;
import java.util.List;

public class GetManagersVisitor implements Visitor {
	List<Employee> managers = new ArrayList<Employee>();

	@Override
	public void visit(Employee e) {
		if (e.getManager() != null) {
			managers.add(e.getManager());
			
			visit(e.getManager());
		}
	}

	@Override
	public void visit(Manager m) {
		if (m.getManager() != null) {
			managers.add(m.getManager());
			
			visit(m.getManager());
		}
	}
	
	public List<Employee> getManagers() {
		return managers;
	}


}
