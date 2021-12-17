package fernbedingung;

public class EinfacheFernbedingung {
    //Kann ein Kommando für eine Taste speichern
    private Kommando slot;
    public EinfacheFernbedingung(){}

    //Eine Methode um der Taste eon Kommando zuzuweisen
    //kann durch mehrfaches Aufrufen Kommando verändern (Fernbedingung programmieren)
    public void setKommando (Kommando k){
        slot = k;
    }
    //Wird aufgerufen wenn Knopf auf Fernbedingung gedrückt wird
    public void knopfGedrueckt(){
        slot.ausfuehren();
    }
}
