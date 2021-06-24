package main.java.edu.mum.cs.cs525.labs.skeleton;

public class Logger implements Observer {
    AccountChangeSubject subject;

    public Logger(AccountChangeSubject subject) {
        this.subject = subject;
        subject.registerChangeSubscriber(this);
    }
    @Override
    public void update(Account account) {
        System.out.println("logging: " + account.toString());
    }
}
