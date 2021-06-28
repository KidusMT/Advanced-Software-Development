package skeleton;

public class AccountServiceTest extends AccountServiceImpl {

    public AccountServiceTest(){
        setAccountDAO(new MockAccountDAO());
    }
}
