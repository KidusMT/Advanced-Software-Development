package main;

public class EmailSender implements Observer {
    @Override
    public void update(Account account) {
        String msg = "Account number EMAIL " + account.getAccountNumber() + " is changed, current balance is " + account.getBalance();
        emailSend(msg);
    }
    public void emailSend(String msg){
        System.out.println(msg);
    }

}
