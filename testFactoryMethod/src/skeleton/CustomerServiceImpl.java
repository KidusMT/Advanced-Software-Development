package skeleton;

public class CustomerServiceImpl implements CustomerService, Service {

    AccountDAO accountDAO;
    String status;

    public void setAccountDAO(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
        if (accountDAO.getClass().getName().equals(MockAccountDAO.class.getName())) status = "Test";
        if (accountDAO.getClass().getName().equals(AccountDAOImpl.class.getName())) status = "Production";
    }

    @Override
    public void createCustomer() {
        System.out.println("Customer: " + status + " created customer");
    }

    @Override
    public void updateCustomer() {
        System.out.println("Customer: " + status + " updated customer");
    }

    @Override
    public void getCustomerAccount() {
        System.out.println("Customer: " + status + " here is your customer");
    }

    @Override
    public void performService() {
        createCustomer();
        updateCustomer();
        getCustomerAccount();
    }
}
