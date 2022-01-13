package commandv2;

public class LichtAnKommando implements Kommando {
    private Licht licht;

    //Konstruktor bekommt Licht mit auf welches Kommando
    //angewendet werden soll . dieses Licht ist der
    //Empfänger (Receiver) der Anfrage
    public LichtAnKommando (Licht licht){
        this.licht = licht;
    }
    //Ruft die Methode des Empfänger (= das kontrolliert Licht) auf
    @Override
    public void ausfuehren() {
        licht.an();
    }
}
