package main.java.edu.mum.cs.cs525.labs.skeleton;

public interface AccountCreationSubject {
    void registerCreationSubscriber(Observer ob);
    void removeCreationSubscriber(Observer ob);
    void notifyCreationObservers();
}
