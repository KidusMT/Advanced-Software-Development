package main;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        CEO ceo = new CEO("ABC1231", "John", "CEO", LocalDate.now());//LocalDate.of(1996, 2, 15)
        Manager manager1 = new Manager("ABC1232", "Tom", "Hanks", LocalDate.now());
        Manager manager2 = new Manager("ABC1233", "Leonardo", "DiCaprio", LocalDate.now());
        Manager manager3 = new Manager("ABC1234", "Johnny", "Depp", LocalDate.now());
        Employee employee1 = new Employee("ABC1235", "Denzel", "Washington", LocalDate.now());
        Employee employee2 = new Employee("ABC1236", "Will", "Smith", LocalDate.now());
        Employee employee3 = new Employee("ABC1237", "Brad", "Pitt", LocalDate.now());

        ceo.hire(manager1);
        ceo.hire(manager2);
        manager1.add(employee1);
        manager1.add(employee2);
        manager2.add(manager3);
        manager3.add(employee3);

        HireCounterAction visitor = new HireCounterAction();
        ceo.accept(visitor);
        System.out.println(visitor.getCount());
    }
}
