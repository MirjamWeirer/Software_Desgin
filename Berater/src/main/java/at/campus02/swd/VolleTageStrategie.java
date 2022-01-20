package at.campus02.swd;

public class VolleTageStrategie implements IStrategie{
    @Override
    public double calcPrice(Rechnung r) {
        double day = r.getHour()/8;
        return day * r.getB().getTagsatz();
    }
}
