package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AccountServiceImpl implements AccountService {
	private AccountDAO accountDAO;

	private SMSSender smsSender;
	private EmailSender emailSender;
	private Logger logger;


	public AccountServiceImpl(){

		accountDAO = new AccountDAOImpl();
		smsSender = new SMSSender();
		emailSender = new EmailSender();
		logger = new Logger();
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

		account.addObserver(smsSender);
		account.addObserver(emailSender);
		account.addObserver(logger);

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

		account.addObserver(smsSender);
		account.addObserver(emailSender);
		account.addObserver(logger);
		account.notify(account);
	}

	public void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
	}
}
