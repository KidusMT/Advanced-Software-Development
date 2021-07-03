package main.java.edu.mum.cs.cs525.labs.skeleton;

public class SavingStrategy implements InterestStrategy {

    @Override
    public double addInterest(double balance) {
//    If balance < 1000 then you get 1% interest
//    If balance > 1000 and balance < 5000 then you get 2% interest
//    If balance > 5000 then you get 4% interest
        double interest = 0.0;

        if(balance < 1000)
            interest = balance * 0.01;
        else if(balance > 1000 && balance < 5000)
            interest = balance * 0.02;
        else if(balance > 5000)
            interest = balance * 0.04;

        return interest;
    }
}
