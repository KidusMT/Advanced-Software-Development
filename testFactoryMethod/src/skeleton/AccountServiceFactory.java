package skeleton;

public class AccountServiceFactory extends ServiceFactory  {

    @Override
    public Service createService(String type) {
        if (type.equals("Test")) {
            return new AccountServiceTest();
        } else if (type.equals("Production")) {
            return new AccountServiceProduction();
        } else return null;
    }
}
