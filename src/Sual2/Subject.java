package Sual2;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observers = new ArrayList<>();
    String message;

    public void add (Observer observer) {
        observers.add(observer);
    }
    public void delete(Observer observer){
        observers.remove(observer);
    }
    public void setMessage(String message){
        this.message = message;
        notifyAllObservers();
    }
    public void notifyAllObservers(){
        for(Observer observer : observers){
            observer.update(message);
        }
    }
}
