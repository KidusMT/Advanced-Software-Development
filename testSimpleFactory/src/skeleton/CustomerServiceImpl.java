package skeleton;

public class CustomerServiceImpl implements CustomerService {
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

}
