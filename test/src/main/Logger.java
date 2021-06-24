package main;

public class Logger implements Observer{

    @Override
    public void update(Account account) {
        String str = "Account Number " + account.getAccountNumber() + " is changed " + account.getBalance();
        logNotify(str);
    }

//    Notify customers changes
    public void logNotify(String string){
        System.out.println(string);
    }
}
