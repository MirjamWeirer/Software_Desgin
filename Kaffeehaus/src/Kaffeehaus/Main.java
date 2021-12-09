package Kaffeehaus;

public class Main {
    public static void main(String[] args) {
        // Espresso mit Milch
        Getränk esp = new Espresso();
        esp = new Milch(esp);
        System.out.println(esp.getBeschreibung());
        System.out.println(esp.kostet());


    }
}
