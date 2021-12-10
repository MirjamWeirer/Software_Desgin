package singleton;

public class Singleton {
    private static Singleton inst;
    private Singleton (){}

    public static Singleton getInstance(){
        if (inst == null){
            inst = new Singleton();
        }
        return inst;
    }
    //stellvertretend für die ganze Funktionalität in der Klasse
    public String getInfo(){
       String  test = "Winke Winke";
       return test;
    }
}
