package entensimulation.v3;

public class Gummiente extends Ente {
    public Gummiente (String name){
        super(name,null);
    }
    @Override
    public void anzeigen() {
        System.out.println("Gummiente guietscht");
    }

    @Override
    public void quacken() {
        System.out.println("quietsch quietsch");
    }
}
