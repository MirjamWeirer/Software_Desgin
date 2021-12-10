package pizzen;
//abstrakte produkt vorlage für Pizzen
public abstract class Pizza {
    protected String name;

    public String getName(){
        return name;
    }
    void prepare(){
        System.out.println("Vorbereiten: " + name);
    }
    void bake(){
        System.out.println("Backe für 4 Minuten bei 350");
    }
    void cut(){
        System.out.println("Pizza in diagonale Schnitten schneiden");
    }
    void box(){
        System.out.println("Pizza in umweltfreundlichen Ökokarton einpacken und mit Liebe verschließen");
    }
    public String toString(){
        String display = "----- " + name + " -----";
        return display;
    }
}
