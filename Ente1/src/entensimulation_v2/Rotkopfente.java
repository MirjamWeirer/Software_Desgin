package entensimulation_v2;

public class Rotkopfente extends Ente {
    public Rotkopfente(String name){
        super(name, 2);
    }

    @Override
    public void anzeigen() {
        System.out.println("Die Rotkopfente zeigt stolz ihren Rotenkopf");
    }
}
