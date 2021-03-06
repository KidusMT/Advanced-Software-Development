package main.java.edu.mum.cs.cs525.labs.skeleton;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Account implements AccountCreationSubject, AccountChangeSubject{
	private Customer customer;

	private String accountNumber;

	private List<AccountEntry> entryList = new ArrayList<AccountEntry>();

	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
		EmailSender emailSender = new EmailSender(this);
		SMSSender smsSender = new SMSSender(this);
		Logger logger = new Logger(this);
		notifyCreationObservers();
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	List<Observer> creationObservers = new ArrayList<>();
	List<Observer> changeObservers = new ArrayList<>();

	public double getBalance() {
		double balance = 0;
		for (AccountEntry entry : entryList) {
			balance += entry.getAmount();
		}
		return balance;
	}

	public void deposit(double amount) {
		AccountEntry entry = new AccountEntry(amount, "deposit", "", "");
		entryList.add(entry);
		notifyChangeObservers();
	}

	public void withdraw(double amount) {
		AccountEntry entry = new AccountEntry(-amount, "withdraw", "", "");
		entryList.add(entry);
		notifyChangeObservers();
	}

	private void addEntry(AccountEntry entry) {
		entryList.add(entry);
	}

	public void transferFunds(Account toAccount, double amount, String description) {
		AccountEntry fromEntry = new AccountEntry(-amount, description, toAccount.getAccountNumber(),
				toAccount.getCustomer().getName());
		AccountEntry toEntry = new AccountEntry(amount, description, toAccount.getAccountNumber(),
				toAccount.getCustomer().getName());
		
		entryList.add(fromEntry);
		
		toAccount.addEntry(toEntry);
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Collection<AccountEntry> getEntryList() {
		return entryList;
	}

	@Override
	public void registerChangeSubscriber(Observer ob) {
		changeObservers.add(ob);
	}

	@Override
	public void removeChangeSubscriber(Observer ob) {
		changeObservers.remove(ob);
	}

	@Override
	public void notifyChangeObservers() {
		for (Observer ob : changeObservers) {
			ob.update(this);
		}
	}


	@Override
	public void registerCreationSubscriber(Observer ob) {
		creationObservers.add(ob);
	}

	@Override
	public void removeCreationSubscriber(Observer ob) {
		creationObservers.remove(ob);
	}

	@Override
	public void notifyCreationObservers() {
		for (Observer ob : creationObservers) {
			ob.update(this);
		}
	}

	@Override
	public String toString() {
		return "Account{" +
				"customer=" + customer +
				", accountNumber='" + accountNumber + '\'' +
				", entryList=" + entryList +
				", creationObservers=" + creationObservers +
				", changeObservers=" + changeObservers +
				'}';
	}
}
