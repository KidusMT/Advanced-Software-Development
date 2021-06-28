package skeleton;

public class CustomerServiceTest extends CustomerServiceImpl {

    public CustomerServiceTest(){
        setAccountDAO(new MockAccountDAO());
    }
}
