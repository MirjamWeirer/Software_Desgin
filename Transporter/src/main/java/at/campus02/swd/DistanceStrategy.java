package at.campus02.swd;

public class DistanceStrategy implements CalcStrategy{
    @Override
    public double calcPrice(Parcel p) {
        return p.getTransporter().getKilometerFee() * p.getDistance();
    }
}
