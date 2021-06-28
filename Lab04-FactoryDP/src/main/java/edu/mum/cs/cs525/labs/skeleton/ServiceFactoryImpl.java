package main.java.edu.mum.cs.cs525.labs.skeleton;

public class ServiceFactoryImpl implements ServiceFactory {
    @Override
    public CustomerService createCustomerService(Environment environment) {
        return new CustomerServiceImpl();
    }

    @Override
    public AccountService createAccountService(Environment environment) {
        return null;
    }
}
