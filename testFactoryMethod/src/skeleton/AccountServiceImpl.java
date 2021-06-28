package skeleton;

import java.util.Collection;

public class AccountServiceImpl implements AccountService, Service {
    private AccountDAO accountDAO;

    public AccountServiceImpl() {
        accountDAO = new AccountDAOImpl();
    }

    public void setAccountDAO(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    public Account createAccount(String accountNumber, String customerName) {
        Account account = new Account(accountNumber);
        Customer customer = new Customer(customerName);
        account.setCustomer(customer);

        accountDAO.saveAccount(account);

        return account;
    }

    public void deposit(String accountNumber, double amount) {
        Account account = accountDAO.loadAccount(accountNumber);
        account.deposit(amount);

        accountDAO.updateAccount(account);
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
    }


    public void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description) {
        Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
        Account toAccount = accountDAO.loadAccount(toAccountNumber);
        fromAccount.transferFunds(toAccount, amount, description);
        accountDAO.updateAccount(fromAccount);
        accountDAO.updateAccount(toAccount);
    }

    @Override
    public void performService() {
        // create 2 accounts;
        createAccount("1263862", "Frank Brown");
        createAccount("4253892", "John Doe");
        // use account 1;
        deposit("1263862", 240);
        deposit("1263862", 529);
        withdraw("1263862", 230);
        // use account 2;
        deposit("4253892", 12450);
        transferFunds("4253892", "1263862", 100, "payment of invoice 10232");
        // show balances

        for (Account account : getAllAccounts()) {
            Customer customer = account.getCustomer();
            System.out.println("Statement for Account: " + account.getAccountNumber());
            System.out.println("Account Holder: " + customer.getName());

            System.out.println("-Date-------------------------"
                    + "-Description------------------"
                    + "-Amount-------------");

            for (AccountEntry entry : account.getEntryList()) {
                System.out.printf("%30s%30s%20.2f\n",
                        entry.getDate().toString(),
                        entry.getDescription(),
                        entry.getAmount());
            }

            System.out.println("----------------------------------------" + "----------------------------------------");
            System.out.printf("%30s%30s%20.2f\n\n", "", "Current Balance:", account.getBalance());
        }
    }
}
