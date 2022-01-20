package hotdrinks;

public class Main {
    public static void main(String[] args) {
        Coffee c = new Coffee();
        c.prepareRecipe();
        System.out.println("---");
        Tea t = new Tea();
        t.prepareRecipe();
    }
}
