package main;

public abstract class InterestPromotionDecorator implements InterestStrategy {
	InterestStrategy wrappedStrategy;
	
	protected InterestPromotionDecorator(InterestStrategy wrappedStrategy) {
		this.wrappedStrategy = wrappedStrategy;
	}
}
