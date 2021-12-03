package wetter.now;

import java.util.ArrayList;
import java.util.List;

//Das ist an sich schon eine bestehende ganz große
//Klasse in unserem Projekt - mit sehr viel Funktionalität
//die wir hier weggelassen haben.
public class Wetterstation implements Subject{
    private List<Observer> observers;
    //interne wetter daten
    private double temperature;
    private double humidity;
    private double pressure;

    public Wetterstation() {
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
    //Wir müssen im subjekt selbst dafür sorgen, dass dieses Methode
    //immer dann aufgerufen wird, wenn sich relevante Daten ändern.
    @Override
    public void notifyObservers() {
        //Wir möchten alle observer über Änderungen informieren.
        for (Observer o : observers){
            o.update(temperature,humidity,pressure);
        }
    }

    //Hier sind noch 100 andere methoden die eine Wetterstation braucht.

    //Funktion die stellvertrend für Sensoreninput aufgerufen wird.
    //Wenn wir explizit die Mehtode aufrufen, dann tun wir so als ob der
    //Sensor neue Daten bekommen hätte.
    public void  setMeasurements (double t, double h, double p){
        temperature = t;
        humidity = h;
        pressure = p;
        notifyObservers();
    }
}
