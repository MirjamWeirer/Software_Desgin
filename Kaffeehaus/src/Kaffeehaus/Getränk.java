package Kaffeehaus;
// Das ist meine Komponente im Decorator Pattern.
public abstract class Getränk {
    protected String beschreibung = "Unbekanntes Getränk";
    public String getBeschreibung(){
        return beschreibung;
    }

    public abstract double kostet();
}
