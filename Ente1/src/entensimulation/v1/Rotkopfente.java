package entensimulation.v1;

import entensimulation.v1.Ente;

public class Rotkopfente extends Ente {
    public Rotkopfente(String name){
        super(name);
    }

    @Override
    public void anzeigen() {
        System.out.println("Die Rotkopfente zeigt stolz ihren Rotenkopf");
    }
}
