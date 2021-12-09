package Kaffeehaus;

public class Main {
    public static void main(String[] args) {
        // Espresso mit Milch
        Getränk esp = new Espresso();
        esp = new Milch(esp);
        System.out.println(esp.getBeschreibung());
        System.out.println(esp.kostet());

        //Filterkaffee mit Milchschaum und Sirup
        Getränk filter = new FilterKaffee();
        filter = new Milchschaum(filter);
        filter = new Milchschaum(filter);
        filter = new Sirup(filter);

        System.out.println(filter.getBeschreibung());
        System.out.println(filter.kostet());
    }
}
