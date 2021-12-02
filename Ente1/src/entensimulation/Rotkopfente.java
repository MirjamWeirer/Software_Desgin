package entensimulation;

public class Rotkopfente extends Ente{
    public Rotkopfente(String name){
        super(name);
    }

    @Override
    public void anzeigen() {
        System.out.println("Die Rotkopfente zeigt stolz ihren Rotenkopf");
    }
}
