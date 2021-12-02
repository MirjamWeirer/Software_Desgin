package entensimulation.v3;

public class Stockente extends Ente {
    public Stockente (String name){
        super(name,new FlatterFlugverhalten());
    }
    @Override
    public void anzeigen() {
        System.out.println("Stockente hat einen Stock im Hintern");
    }
}
