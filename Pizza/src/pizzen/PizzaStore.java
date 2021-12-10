package pizzen;
//Verwaltet einen ganzen PizzaStore und hat noch
//sehr viele andere Methoden die wir hier nicht sehen
public abstract class PizzaStore {
    //factory Methode
    protected abstract Pizza createPizza(String item);
    //eine dieser vielen Methoden in dieser Klasse
    public Pizza orderPizza(String type){
        //hier rufen wir factory Methode auf
        // (der Code der sich oft ändert)
        Pizza pizza = createPizza(type);

        //hier ist der Code der sich selten ändert und wir nicht angreifen möchten (um Fehler zu vermeiden)
        System.out.println("--- Mache eine " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
