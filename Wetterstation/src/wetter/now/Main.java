package wetter.now;

public class Main {
    public static void main(String[] args) {
        Wetterstation ws = new Wetterstation(); //unser subjekt

        DigitalDisplay dD = new DigitalDisplay(ws);
        ws.setMeasurements(22,60,1000);
        System.out.println("--------");
        SmartphoneDisplay sD = new SmartphoneDisplay(ws);
        ws.setMeasurements(21,65,1003);
    }
}
