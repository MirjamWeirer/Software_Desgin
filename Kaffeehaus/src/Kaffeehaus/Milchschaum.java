package Kaffeehaus;

public class Milchschaum extends ZutatDecorator{
    public Milchschaum(Getränk getränk) {
        super(getränk);
    }

    @Override
    public double kostet() {
        return getränk.kostet() + 1.1;
    }

    @Override
    public String getBeschreibung() {
        return getränk.getBeschreibung() + ", Milchschaum";
    }
}
