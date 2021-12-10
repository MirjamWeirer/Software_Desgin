package at.campus02.swd;

public class WeightStrategy implements CalcStrategy{

    @Override
    public double calcPrice( Parcel p) {
        return p.getTransporter().getKilogramFee() * p.getWeight();
    }
}
