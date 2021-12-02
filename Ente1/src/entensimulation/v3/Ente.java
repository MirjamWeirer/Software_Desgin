package entensimulation.v3;

public abstract class Ente {
    private String name;
    private Flugverhalten flugVerhalten;

    public Ente (String name, Flugverhalten fV){
        this.name = name;
        flugVerhalten = fV;
    }

    public void quacken(){
        System.out.println("Ente " + name + " quackt");
    }

    //In Klassendiagramm hieß Methoden performFliegen - wir belassen den namen
    //weil wir (bzw. Christian) faul ist
    public void performFliegen(){
        if (flugVerhalten != null){
            flugVerhalten.fliegen();
        }
    }
    public void schwimmen(){
        System.out.println("Ente " + name + " schwimmt");
    }
    public abstract void anzeigen();

}
