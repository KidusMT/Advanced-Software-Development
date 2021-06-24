package main;

public class SMSSender implements Observer {

    @Override
    public void update(Account account) {
        String msg = "Account number SMS " + account.getAccountNumber() + " is changed, current balance is " + account.getBalance();
        sendSMS(msg);
    }

    private void sendSMS(String msg) {
        System.out.println(msg);
    }
}
