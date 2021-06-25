package skeleton;

public class P1 extends InterestPromotionDecorator {
    public P1(String accountNumber, Account newAccount) {
        super(accountNumber, newAccount);
    }

    @Override
    public void addInterest() {
//        account.addInterest();
        double interest = interestStrategy.addInterest(getBalance());

        double newInterest = interest + (interest*0.01);

        AccountEntry accountEntry = new AccountEntry(newInterest, "interest", "", "");

        account.getEntryList().add(accountEntry);
    }
}
