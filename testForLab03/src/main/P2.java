package main;

public class P2 extends InterestPromotionDecorator {

	protected P2(InterestStrategy wrappedStrategy) {
		super(wrappedStrategy);
	}

	@Override
	public double calculateInterest(double balance) {
		return 0.02*balance + wrappedStrategy.calculateInterest(balance);
	}

}
