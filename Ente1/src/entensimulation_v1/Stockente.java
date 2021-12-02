package entensimulation_v1;

public class Stockente extends Ente{
    public Stockente (String name){
        super(name);
    }
    @Override
    public void anzeigen() {
        System.out.println("Stockente hat einen Stock im Hintern");
    }
}
