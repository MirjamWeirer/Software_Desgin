package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton dbZugriff = Singleton.getInstance();
        System.out.println(dbZugriff.getInfo());
    }

}
