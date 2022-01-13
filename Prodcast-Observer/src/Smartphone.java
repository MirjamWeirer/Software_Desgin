public class Smartphone implements Observer{
    private String name;
    private String url;
    private double minutes;
    private Subject prodcast;
    public Smartphone(Subject p){
        prodcast = p;
        prodcast.registerObserver(this);
    }
    public void stopReceivingProdcast(){
        prodcast.removeObserver(this);
        //prodcast = null;
    }
    public void startReceivingProdcast(){
        prodcast.registerObserver(this);
    }
    @Override
    public void update(String name, String url, double minutes) {
        this.name = name;
        this.url = url;
        this.minutes = minutes;
        System.out.println("Smartphones Prodcasts: " + this.name + ", " + this.url + ", " + this.minutes);
    }
}
