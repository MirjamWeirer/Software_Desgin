package Kaffeehaus;

public class Sirup extends ZutatDecorator{
    public Sirup(Getränk getränk) {
        super(getränk);
    }

    @Override
    public double kostet() {
        return getränk.kostet() + 1;
    }

    @Override
    public String getBeschreibung() {
        return getränk.getBeschreibung() + ", Sirup";
    }
}
