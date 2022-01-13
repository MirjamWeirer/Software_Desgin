package beispiel.command;

public class LichtAusKommando implements Kommando {
    private Licht licht;

    //Konstruktor bekommt Licht mit auf welches Kommando
    //angewendet werden soll . dieses Licht ist der
    //Empfänger (Receiver) der Anfrage
    public LichtAusKommando(Licht licht){
        this.licht = licht;
    }
    //Ruft die Methode des Empfänger (= das kontrolliert Licht) auf
    @Override
    public void ausfuehren() {
        licht.aus();
    }
}
