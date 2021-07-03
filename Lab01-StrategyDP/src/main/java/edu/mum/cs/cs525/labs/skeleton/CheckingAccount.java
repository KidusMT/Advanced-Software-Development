package main.java.edu.mum.cs.cs525.labs.skeleton;

public class CheckingAccount extends Account{
    public CheckingAccount(String accountNumber) {
        super(accountNumber);
        interestStrategy = new CheckingStrategy();
    }
}
