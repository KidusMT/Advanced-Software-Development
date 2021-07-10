package main;

public interface Visitor {
	void visit(Manager m);
	void visit(Employee e);

}
