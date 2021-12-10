package pizzen;

public class GrazPizzaStore extends PizzaStore{
    //setzen die factory Methode um
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("mushroom")){
            return new GrazMushroomPizza();
        }else if (item.equals("veggie")){
            return new GrazVeggiePizza();
        }
        return null;
    }
}
