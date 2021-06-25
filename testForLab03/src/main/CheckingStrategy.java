package main;

public class CheckingStrategy implements InterestStrategy {

	@Override
	public double calculateInterest(double balance) {
		if(balance<1000) {
			return balance*0.015;
		}else {
			return balance*0.025;
		}
		
	}

}
