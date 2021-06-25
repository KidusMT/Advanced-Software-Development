package main;

public class P1 extends InterestPromotionDecorator {

	protected P1(InterestStrategy wrappedStrategy) {
		super(wrappedStrategy);
	}

	@Override
	public double calculateInterest(double balance) {
		return 0.01*balance + wrappedStrategy.calculateInterest(balance);
	}

}
