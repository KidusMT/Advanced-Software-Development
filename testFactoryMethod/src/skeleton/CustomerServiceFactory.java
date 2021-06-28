package skeleton;

public class CustomerServiceFactory extends ServiceFactory {

    @Override
    public Service createService(String type) {
        if (type.equals("Test")) {
            return new CustomerServiceTest();
        } else if (type.equals("Production")) {
            return new CustomerServiceProduction();
        } else return null;
    }
}
