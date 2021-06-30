package skeleton;

public class Application {
    public static void main(String[] args) {
        ServiceFactory CServiceFactory = new CustomerServiceFactory();
        AccountServiceFactory AServiceFactory = new AccountServiceFactory();
        Service accountService = CServiceFactory.createSomething("Production");

        accountService.performService();

    }
}
