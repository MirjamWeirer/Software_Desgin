package Kaffeehaus;

public class FilterKaffee extends Getränk{
    public FilterKaffee(){
        beschreibung = "Filterkaffee";
    }
    @Override
    public double kostet() {
        return 1.0;
    }
}
