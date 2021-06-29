package main.java.edu.mum.cs.cs525.labs.skeleton.v1;

public class DepositCommand implements Command {

    private AccountServiceImpl accountService;
    private String accountNumber;
    private double amount;

    public DepositCommand(AccountServiceImpl accountService, String accountNumber, double amount) {
        this.accountService = accountService;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    @Override
    public void execute() {
        accountService.deposit(accountNumber, amount);
    }

    @Override
    public void undo() {
        // withdraw the amount of money deposited from the account
        accountService.withdraw(accountNumber, amount);
    }
}
