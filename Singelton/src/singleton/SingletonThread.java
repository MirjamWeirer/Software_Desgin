package singleton;

public class SingletonThread {
    //merken uns die instanz auf einer statischen variable
    private static SingletonThread inst;
    private double randomNumber;
    //verhindert Objekterzeugung außerhalb der Klasse da private
    private SingletonThread(){
        //hier die rundherum Funktionalität initialisieren
        randomNumber = Math.random();
    }
    //NUR EINE KLasse zur Laufzeit darf gleichzeitig diese Methode ausführen
    public static synchronized SingletonThread getInstance(){
        if (inst == null){
            inst = new SingletonThread();
        }
        return inst;
    }
    //stellvertretend für die ganze Funktionalität in der Klasse
    public String getInfo(){
       return "Threadsafe Winke Winke " + randomNumber;
    }
}
