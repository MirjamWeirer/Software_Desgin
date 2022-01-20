package hotdrinks;

public abstract class CaffeineBeverage {
    //template methode - can't be overwritten
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    protected void boilWater(){
        System.out.println("Cook water 100 geg C");
    }
    protected abstract void brew();
    protected void pourInCup(){
        System.out.println("Pur into our Cup");
    }
    protected abstract void addCondiments();
}
