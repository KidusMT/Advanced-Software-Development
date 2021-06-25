package skeleton;

public class P3 extends InterestPromotionDecorator {
    public P3(String accountNumber, Account newAccount) {
        super(accountNumber, newAccount);
    }

    @Override
    public void addInterest() {
        double interest = interestStrategy.addInterest(getBalance());

        double newInterest = interest + (interest*0.03);

        AccountEntry accountEntry = new AccountEntry(newInterest, "interest", "", "");

        account.getEntryList().add(accountEntry);
    }
}
