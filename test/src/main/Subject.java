package main;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observer = new ArrayList<>();
    void addObserver(Observer obs){
        observer.add(obs);
    }
    void deleteObserver(Observer obs){
        observer.remove(obs);
    }
     void notify(Account account) {
         //observer.forEach(obs -> obs.update(account));
         for(Observer obs: observer){
             obs.update(account);
         }
     }
}
