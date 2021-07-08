package main;

public class Application {

    public static void main(String[] args) {
        CEO ceo = new CEO("John CEO");
        Manager manager1 = new Manager("Tom Hanks");
        Manager manager2 = new Manager("Leonardo DiCaprio");
        Manager manager3 = new Manager("Johnny Depp");
        Employee employee1 = new Employee("Denzel Washington");
        Employee employee2 = new Employee("Will Smith");
        Employee employee3 = new Employee("Brad Pitt");

        ceo.hire(manager1);
        ceo.hire(manager2);
        manager1.add(employee1);
        manager1.add(employee2);
        manager2.add(manager3);
        manager3.add(employee3);
//        ceo.print();

        HireCounterAction visitor = new HireCounterAction();
        ceo.visit(visitor);
        System.out.println(visitor.getCount());
    }
}
