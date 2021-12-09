package Kaffeehaus;

public class Espresso extends Getränk{

    public Espresso(){
        beschreibung = "Espresso";
    }

    @Override
    public double kostet() {
        return 1.90;
    }
}
