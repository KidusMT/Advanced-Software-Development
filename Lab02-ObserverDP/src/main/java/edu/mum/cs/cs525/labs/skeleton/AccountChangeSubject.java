package main.java.edu.mum.cs.cs525.labs.skeleton;

public interface AccountChangeSubject {
    void registerChangeSubscriber(Observer ob);
    void removeChangeSubscriber(Observer ob);
    void notifyChangeObservers();
}
