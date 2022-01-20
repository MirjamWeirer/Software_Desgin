package hotdrinks;

public class Tea extends CaffeineBeverage{
    @Override
    protected void boilWater(){
        System.out.println("Boil water with 95 deg C");
    }
    @Override
    protected void brew() {
        System.out.println("Brew the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Two shot of gin");
    }
}
