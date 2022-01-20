package at.campus02.swd;

public class StundenStrategie implements IStrategie{
    @Override
    public double calcPrice(Rechnung r) {
        return r.getB().getStundensatz() * r.getHour();
    }
}
