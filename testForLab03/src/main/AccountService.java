package main;

import java.util.Collection;

public interface AccountService {
    Account createAccount(String accountNumber, InterestStrategy accType, String customerName);
    Account getAccount(String accountNumber);
    Collection<Account> getAllAccounts();
    void deposit (String accountNumber, double amount);
    void withdraw (String accountNumber, double amount);
    void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description);
    void addInterest();//all accounts
}
