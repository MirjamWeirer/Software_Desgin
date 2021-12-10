package pizzen;

public class WienPizzaStore extends PizzaStore{
    //setzen die factory Methode um
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("mushroom")){
            return new WienMushroomPizza();
        }else if (item.equals("veggie")){
            return new WienVeggiePizza();
        }
        return null;
    }
}
