package skeleton;

public abstract class InterestPromotionDecorator extends Account {
    Account account;
    public InterestPromotionDecorator(String accountNumber, Account newAccount) {
        super(accountNumber);
        account = newAccount;
    }

    public abstract void addInterest();
}
