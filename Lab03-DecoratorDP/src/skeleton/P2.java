package skeleton;

public class P2 extends InterestPromotionDecorator {
    public P2(InterestStrategy newAccount) {
        super(newAccount);
    }

    @Override
    double addInterest(double balance) {
        return interestStrategy.addInterest(balance) + (balance*0.02);
    }
}
