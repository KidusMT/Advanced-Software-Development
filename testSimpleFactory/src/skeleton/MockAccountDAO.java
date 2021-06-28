package skeleton;

import java.util.Arrays;
import java.util.Collection;

public class MockAccountDAO implements AccountDAO {
    Customer customer = new Customer("Brad Pit");
    @Override
    public void saveAccount(Account account) {
        account.setCustomer(customer);
        account.deposit(1000);
        System.out.println("Mock Account: " + account.getAccountNumber() + " saved");
    }

    @Override
    public void updateAccount(Account account) {
        account.setCustomer(customer);
        account.deposit(1000);
        System.out.println("Mock Account: " + account.getAccountNumber() + " updated");
    }

    @Override
    public Account loadAccount(String accountnumber) {
        System.out.println("Mock Account: " + accountnumber + " loaded");
        Account account = new Account("234234");
        account.setCustomer(customer);
        account.deposit(1000);
        return account;
    }

    @Override
    public Collection<Account> getAccounts() {
        Account account1 = new Account("234234");
        account1.setCustomer(customer);
        account1.deposit(1000);
        Account account2 = new Account("123123");
        account2.setCustomer(customer);
        account2.deposit(1000);
        Account account3 = new Account("123123");
        account3.setCustomer(customer);
        account3.deposit(1000);
        Account account4 = new Account("234521");
        account4.setCustomer(customer);
        account4.deposit(1000);
        Collection<Account> acounts = Arrays.asList(account1, account2, account3, account4);
        System.out.println("Mock Account: " + acounts.size() + " accounts loaded");
        return acounts;
    }
}
