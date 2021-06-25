package skeleton;

public class P2 extends InterestPromotionDecorator {
    public P2(String accountNumber, Account newAccount) {
        super(accountNumber, newAccount);
    }

    @Override
    public void addInterest() {
        double interest = interestStrategy.addInterest(getBalance());

        double newInterest = interest + (interest*0.02);

        AccountEntry accountEntry = new AccountEntry(newInterest, "interest", "", "");

        account.getEntryList().add(accountEntry);
    }
}
