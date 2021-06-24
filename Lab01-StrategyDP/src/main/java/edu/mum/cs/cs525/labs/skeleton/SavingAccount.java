package main.java.edu.mum.cs.cs525.labs.skeleton;

public class SavingAccount extends Account{
    public SavingAccount(String accountNumber) {
        super(accountNumber);
        interestFunctionalities = new SavingInterestCalc();
    }
}
