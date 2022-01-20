package hotdrinks;

public class Coffee extends CaffeineBeverage{
    @Override
    protected void brew() {
        System.out.println("Brew with paper filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Two shot of mil, one shot Grappa");
    }
}
