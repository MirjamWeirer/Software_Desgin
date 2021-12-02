package entensimulation.v1;

public abstract class Ente {
    private String name;

    public Ente (String name){
        this.name = name;
    }

    public void quacken(){
        System.out.println("Ente " + name + " quackt");
    }

    public void fliegen(){
        System.out.println("Ente " + name + " fliegt");
    }
    public void schwimmen(){
        System.out.println("Ente " + name + " schwimmt");
    }
    public abstract void anzeigen();

}
