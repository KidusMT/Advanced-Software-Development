package main;

import java.util.ArrayList;
import java.util.Collection;

public class GetManagersVisitor implements Visitor{
	Collection<Manager> managers = new ArrayList<>();

	@Override
	public void visit(Manager m) {
		managers.add(m);
	}
	@Override
	public void visit(Employee e) {
	}
	public Collection<Manager> getManagers() {
		return managers;
	}
}
