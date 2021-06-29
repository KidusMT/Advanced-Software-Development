package main.java.edu.mum.cs.cs525.labs.skeleton;

public class TransferFundCommand implements Command {

    String fromAccountNumber;
    String toAccountNumber;
    double amount;
    String description;
    private final AccountServiceImpl accountService;

    public TransferFundCommand(AccountServiceImpl accountService, String fromAccountNumber, String toAccountNumber, double amount, String description) {
        this.accountService = accountService;
        this.fromAccountNumber = fromAccountNumber;
        this.toAccountNumber = toAccountNumber;
        this.amount = amount;
        this.description = description;
    }

    @Override
    public void execute() {
        accountService.transferFunds(fromAccountNumber, toAccountNumber, amount, description);
    }

    @Override
    public void undo() {
        // transfer the money back to the account, swapping the "from" and "to" of the accountNumber parameters
        accountService.transferFunds(toAccountNumber, fromAccountNumber, amount, description);
    }
}
