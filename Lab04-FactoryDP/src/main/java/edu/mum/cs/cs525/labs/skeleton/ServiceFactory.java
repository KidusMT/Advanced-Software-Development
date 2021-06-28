package main.java.edu.mum.cs.cs525.labs.skeleton;

public interface ServiceFactory {
    CustomerService createCustomerService(Environment environment);
    AccountService createAccountService(Environment environment);
}
