package main.java.edu.mum.cs.cs525.labs.skeleton;

public class CustomerServiceImpl extends Environment implements CustomerService {
    @Override
    public void createCustomer() {
        System.out.println("Customer: created customer");
    }

    @Override
    public void updateCustomer() {
        System.out.println("Customer: updated customer");
    }

    @Override
    public void getCustomerAccount() {
        System.out.println("Customer: here is your customer");
    }

    @Override
    Service getTestEnvironment(String type) {
        return null;
    }

    @Override
    Service getProductionEnvironment(String type) {
        return null;
    }
}
