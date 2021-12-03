package Medienverlag;

public class PrintAbonnentInnen implements Observer{
    private String title;
    private String inhalt;
    private Subject nachricht;
    public PrintAbonnentInnen(Subject n){
        nachricht = n;
        nachricht.registerObserver(this);
    }
    public void stopReceivingNachricht(){
        nachricht.removeObserver(this);
        //nachricht = null;
    }
    public void startReceivingNachricht(){
        nachricht.registerObserver(this);
    }
    @Override
    public void update(String titel, String inhalt) {
        this.title = titel;
        this.inhalt = inhalt;
        System.out.println("Printabonnent*innen: " + titel + ", " + inhalt);
    }
}
