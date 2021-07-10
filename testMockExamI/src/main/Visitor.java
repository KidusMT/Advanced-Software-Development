package main;

public interface Visitor {
	void visit(Employee e);
	void visit(Manager m);
}
