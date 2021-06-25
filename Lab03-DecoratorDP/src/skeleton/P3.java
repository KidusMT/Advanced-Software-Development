package skeleton;

public class P3 extends InterestPromotionDecorator {
    public P3(InterestStrategy newAccount) {
        super(newAccount);
    }

    @Override
    double addInterest(double balance) {
        return interestStrategy.addInterest(balance) + (balance*0.03);
    }
}
