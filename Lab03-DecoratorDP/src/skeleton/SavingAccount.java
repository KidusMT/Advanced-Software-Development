package skeleton;

public class SavingAccount extends Account{
    public SavingAccount(String accountNumber) {
        super(accountNumber);
        interestStrategy = new SavingStrategyImpl();
    }
}
