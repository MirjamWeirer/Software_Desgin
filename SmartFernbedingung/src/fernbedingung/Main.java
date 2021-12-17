package fernbedingung;

public class Main {
    //das ist unser klient im pattern
    public static void main(String[] args) {
        //Fernbedingung ist unser aufrufer (invoker)
        EinfacheFernbedingung fb = new EinfacheFernbedingung();
        Licht licht = new Licht();//wird ab nächster Zeile unser Empfänger sein
        LichtAnKommando lk = new LichtAnKommando(licht);
        //weisen ein Kommando dem Aufrufer zu
        fb.setKommando(lk);
        //später (ganz wo anders)
        fb.knopfGedrueckt();
    }
}
