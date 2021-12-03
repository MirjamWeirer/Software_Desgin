package Medienverlag;

import java.util.ArrayList;
import java.util.List;

public class Nachrichtenartikel implements Subject{
    private List<Observer> observers;
    private String title;
    private String inhalt;

    public Nachrichtenartikel(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer o : observers){
            o.update(title,inhalt);
        }
    }

    public void setTitleAndInhalt(String t, String i){
        title = t;
        inhalt = i;
        notifyObserver();
    }
}
