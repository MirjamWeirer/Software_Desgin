import java.util.ArrayList;
import java.util.List;

public class ProdcastServer implements Subject{
    private List<Observer> observers;
    private String name;
    private String url;
    private double minutes;

    public ProdcastServer(){
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
        for (Observer o : observers){
            o.update(name,url,minutes);
        }
    }

    public void setProdcast(String n, String u, double m){
        name = n;
        url = u;
        minutes = m;
    }
}
