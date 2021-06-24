package main.java.edu.mum.cs.cs525.labs.skeleton;

public class EmailSender implements Observer {

    AccountCreationSubject subject;

    public EmailSender(AccountCreationSubject subject) {
        this.subject = subject;
        subject.registerCreationSubscriber(this);
    }

    @Override
    public void update(Account account) {
        System.out.println("Account Creation = EmailSender: " + account.getBalance());
    }
}
