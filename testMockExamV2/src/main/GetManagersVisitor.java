package main;

import java.util.*;

public class GetManagersVisitor implements Visitor {
	List<Employee> managers = new ArrayList<Employee>();

	@Override
	public void visit(Employee e) {	
//		if (e.getManager() != null) {
//			managers.add(e.getManager());
//		}
	}

	@Override
	public void visit(Manager m) {
//		visit((Employee) m);
		managers.add(m);
	}
	
	public List<Employee> getManagers() {
		return managers;
	}


}
