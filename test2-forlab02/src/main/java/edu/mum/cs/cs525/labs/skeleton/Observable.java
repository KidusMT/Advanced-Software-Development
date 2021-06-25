package main.java.edu.mum.cs.cs525.labs.skeleton;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public interface Observable<T> {
    Map<EventType, Set<Observer>> observerList = new HashMap<>();

    default void addObserver(Observer observer, EventType eventType) {
        Set<Observer> observers;

        if(observerList.containsKey(eventType)){
            observers = observerList.get(eventType);
        }
        else{
            observers = new HashSet<>();
            observerList.put(eventType, observers);
        }
        observers.add(observer);
    }

    default void removeObserver(Observer observer, EventType eventType) {
        Set<Observer> observers = observerList.get(eventType);

        if(observers == null)
            throw new NullPointerException();

        if(observers.contains(observer)){
            observers.remove(observer);
            observerList.put(eventType, observers);
        }
    }

   <T> void notify(T message, EventType eventType);
}
