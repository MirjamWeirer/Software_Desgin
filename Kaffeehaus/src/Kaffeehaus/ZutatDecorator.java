package Kaffeehaus;
//Unsere Decorator Klasse (auch Wrapper genannt).
public abstract class ZutatDecorator extends Getränk{
    protected Getränk getränk;

    public ZutatDecorator (Getränk getränk){
        this.getränk = getränk;
    }
    //zwinge alle Kassen die davon ableiten die Methode zu überschreiben
    public abstract String getBeschreibung();
}
