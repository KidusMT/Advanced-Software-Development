package skeleton;

public class AccountServiceProduction extends AccountServiceImpl{

    public AccountServiceProduction(){
        setAccountDAO(new AccountDAOImpl());
    }
}
