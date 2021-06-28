package skeleton;

public class CustomerServiceProduction extends CustomerServiceImpl{

    public CustomerServiceProduction(){

        setAccountDAO(new AccountDAOImpl());
    }
}
