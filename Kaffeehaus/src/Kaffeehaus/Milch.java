package Kaffeehaus;

public class Milch extends ZutatDecorator{
    public Milch(Getränk getränk) {
        super(getränk);
    }

    @Override
    public double kostet() {
        return getränk.kostet() + 0.8;
    }

    @Override
    public String getBeschreibung() {
        return getränk.getBeschreibung() + ", Milch";
    }
}
