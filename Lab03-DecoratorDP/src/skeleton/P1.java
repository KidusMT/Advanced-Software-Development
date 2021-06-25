package skeleton;

public class P1 extends InterestPromotionDecorator {
    public P1(InterestStrategy newAccount) {
        super(newAccount);
    }

    @Override
    double addInterest(double balance) {
        return interestStrategy.addInterest(balance) + (balance*0.01);
    }
}
