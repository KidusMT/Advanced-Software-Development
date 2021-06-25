package main;

public class P3 extends InterestPromotionDecorator {

	protected P3(InterestStrategy wrappedStrategy) {
		super(wrappedStrategy);
	}

	@Override
	public double calculateInterest(double balance) {
		return 0.03*balance + wrappedStrategy.calculateInterest(balance);
	}

}
