package pizzen;

public class Main {
    public static void main(String[] args) {
        PizzaStore gStore = new GrazPizzaStore();
        PizzaStore wStore = new WienPizzaStore();

        Pizza pizza1 = gStore.orderPizza("mushroom");
        System.out.println("Ich bestelle eine " + pizza1.getName());

        Pizza pizza2 = wStore.orderPizza("veggie");
        System.out.println("Ich bestelle eine " + pizza2.getName());
    }
}
