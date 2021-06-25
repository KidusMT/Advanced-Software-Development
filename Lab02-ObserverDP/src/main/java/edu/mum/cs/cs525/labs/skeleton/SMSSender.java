package main.java.edu.mum.cs.cs525.labs.skeleton;

public class SMSSender implements Observer {
//    AccountChangeSubject subject;

    public SMSSender(AccountChangeSubject subject) {
//        this.subject = subject;
        subject.registerChangeSubscriber(this);
    }

    @Override
    public void update(Account account) {
        System.out.println("Account Change = SMS Sender: " + account.getBalance());
    }
}
