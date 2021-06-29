package main.java.edu.mum.cs.cs525.labs.skeleton.v3;

public class WithdrawCommand implements Command {

    private AccountServiceImpl accountService;
    private String accountNumber;
    private double amount;

    public WithdrawCommand(AccountServiceImpl accountService, String accountNumber, double amount) {
        this.accountService = accountService;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    @Override
    public void execute() {
        accountService.withdraw(accountNumber, amount);
    }

//    @Override
//    public void undo() {
//        // deposit of money withdrawn back to the account
//        accountService.deposit(accountNumber, amount);
//    }
}
