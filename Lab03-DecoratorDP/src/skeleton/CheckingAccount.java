package skeleton;

public class CheckingAccount extends Account{
    public CheckingAccount(String accountNumber) {
        super(accountNumber);
        interestStrategy = new CheckingStrategyImpl();
    }
}
