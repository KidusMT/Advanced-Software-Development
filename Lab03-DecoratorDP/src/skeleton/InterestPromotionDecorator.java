package skeleton;

public abstract class InterestPromotionDecorator extends InterestStrategy {
    InterestStrategy interestStrategy;
    public InterestPromotionDecorator(InterestStrategy newAccount) {
        interestStrategy = newAccount;
    }

}
