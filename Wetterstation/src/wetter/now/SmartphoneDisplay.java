package wetter.now;

public class SmartphoneDisplay implements Observer {
    private double temperature;
    private double humidity;
    private double pressure;
    //Merken uns das Subject damit wir uns später wieder vom Subject abmelden können.
    private Subject wetterDaten;
    public SmartphoneDisplay (Subject wd){
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
        this.humidity = humidity;
        this.pressure = pressure;
        //Hier wird das Smartphonedisplay umgeschaltet
        System.out.println("Smartphone: " + temperature + ", " + this.humidity + ", " + this.pressure);
    }
}
