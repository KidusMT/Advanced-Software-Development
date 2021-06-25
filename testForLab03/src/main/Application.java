package main;

public class Application {
	public static void main(String[] args) {
		AccountService accountService = new AccountServiceImpl();

		// create 2 accounts;
		accountService.createAccount("1263862", InterestStrategyFactory.CHECKING, "Frank Brown");
		accountService.createAccount("4253892", InterestStrategyFactory.SAVING, "John Doe");
		
		// create 3rd account
		InterestStrategy account3Strategy = InterestStrategyFactory.SAVING;	
		accountService.createAccount("3333333", account3Strategy , "Boaz Turyahikayo");
		
		// use account 1;
		accountService.deposit("1263862", 240);
		accountService.deposit("1263862", 529);
		accountService.withdraw("1263862", 230);
		// use account 2;
		accountService.deposit("4253892", 12450);
		accountService.transferFunds("4253892", "1263862", 100, "payment of invoice 10232");
		// use account 3;
		accountService.deposit("3333333", 100000);
		
		//----------interest on all accounts-------------------
		accountService.addInterest();
	
		//re adjust account 3
		Account three = accountService.getAccount("3333333");
		three.withdraw(4000);
		
		account3Strategy = new P2(account3Strategy);
		account3Strategy = new P1(account3Strategy);
		three.setInterestStrategy(account3Strategy);
		//three.addInterest();
	
		
		//----------interest on all accounts-------------------again
		accountService.addInterest();
	
	
		// show balances
		for (Account account : accountService.getAllAccounts()) {
			Customer customer = account.getCustomer();
			System.out.println("Statement for Account: " + account.getAccountNumber());
			System.out.println("Account Holder: " + customer.getName());
			
			System.out.println("-----------Date---------------" 
					+ "-----------------Description--" 
					          + "-----------Amount---");
			
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
