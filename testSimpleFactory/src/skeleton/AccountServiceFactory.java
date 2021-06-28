package skeleton;

public class AccountServiceFactory {

    public AccountServiceImpl createAccountService(String type) {
        if (type.equals("Test")) {
            return new AccountServiceTest();
        } else if (type.equals("Production")) {
            return new AccountServiceProduction();
        } else return null;
    }
}
