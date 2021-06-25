package main;

public class SavingsStrategy implements InterestStrategy {

	@Override
	public double calculateInterest(double balance) {
		// TODO Auto-generated method stub
		if(balance<1000) {
			return balance*0.01;
		}else if(balance>=1000 && balance<5000) {
			return balance*0.02;
		}else {
			return balance*0.04;
		}
		
	}

}
