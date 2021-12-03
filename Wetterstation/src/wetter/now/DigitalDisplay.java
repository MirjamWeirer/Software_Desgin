package wetter.now;

public class DigitalDisplay implements Observer{
    //Simples Display: kann nur die Temperatur anzeigen
    private double temperature;
    //Merken uns das Subject damit wir uns später wieder vom Subject abmelden können.
    private Subject wetterDaten;
    public DigitalDisplay (Subject wd){
        wetterDaten = wd;
        wetterDaten.registerObserver(this);
    }

    //zum abmelden (diese müssten nicht unbedingt sein - problemabhängig)
    public void stopReceivingWeatherData(){
        wetterDaten.removeObserver(this);
        //wetterDaten = null; //abhängig vom Problem
    }
    //erneut anmelden (müssten nicht unbedingt - problemabhängig)
    public void startReceivingWeatherData(){
        wetterDaten.registerObserver(this);
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        //Hier müssen wir unser DigitalDisplay mit den neuen Daten aktualisieren.
        temperature = temp;
        //Hier wird das Display umgeschaltet
        System.out.println("Digitalanzeige: " + temperature);
    }
}
