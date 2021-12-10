package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton dbZugriff = Singleton.getInstance();
        System.out.println(dbZugriff.getInfo());
        SingletonThread sT = SingletonThread.getInstance();
        System.out.println(sT.getInfo());
        System.out.println("---------Viel später - Referenz nicht mehr vorhanden ------------");
        sT = SingletonThread.getInstance();
        System.out.println(sT.getInfo());
    }

}
