package main.java.edu.mum.cs.cs525.labs.skeleton;

import java.util.Collection;

public class AccountServiceImpl implements AccountService {
    private AccountDAO accountDAO;

    public AccountServiceImpl() {
        accountDAO = new AccountDAOImpl();
    }

    public Account createAccount(String accountNumber, String customerName) {
        Account account = new Account(accountNumber);
        Customer customer = new Customer(customerName);
        account.setCustomer(customer);

        accountDAO.saveAccount(account);
        notify("New account created for " + customerName, EventType.NEW_ACCOUNT);
        return account;
    }

    public void deposit(String accountNumber, double amount) {
        Account account = accountDAO.loadAccount(accountNumber);
        account.deposit(amount);

        accountDAO.updateAccount(account);
        notify(amount + "$ is deposited to " + accountNumber, EventType.ACCOUNT_CHANGE);

    }

    public Account getAccount(String accountNumber) {
        Account account = accountDAO.loadAccount(accountNumber);
        return account;
    }

    public Collection<Account> getAllAccounts() {
        return accountDAO.getAccounts();
    }

    public void withdraw(String accountNumber, double amount) {
        Account account = accountDAO.loadAccount(accountNumber);
        account.withdraw(amount);
        accountDAO.updateAccount(account);
        notify(amount + "$ is withdrawn from " + accountNumber, EventType.ACCOUNT_CHANGE);

    }


    public void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description) {
        Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
        Account toAccount = accountDAO.loadAccount(toAccountNumber);
        fromAccount.transferFunds(toAccount, amount, description);
        accountDAO.updateAccount(fromAccount);
        accountDAO.updateAccount(toAccount);
    }


    @Override
    public <T> void notify(T message, EventType targetEvent) {
        if(!observerList.containsKey(targetEvent))
            return;

        for (Observer observer : observerList.get(targetEvent)
        ) {
            observer.update(message);
        }
    }
}
