package entensimulation.v3;

public class Rotkopfente extends Ente {
    public Rotkopfente(String name){
        super(name, new SegelFlugverhalten());
    }

    @Override
    public void anzeigen() {
        System.out.println("Die Rotkopfente zeigt stolz ihren Rotenkopf");
    }
}
