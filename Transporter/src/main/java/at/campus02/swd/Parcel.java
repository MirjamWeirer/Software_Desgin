package at.campus02.swd;

public class Parcel {
    private Transporter transporter;
    private double weight;
    private int distance;
    private CalcStrategy calcStrategy;

    public Parcel(Transporter transporter, double weight, int distance) {
        this.transporter = transporter;
        this.weight = weight;
        this.distance = distance;
    }

    public Transporter getTransporter() {
        return transporter;
    }

    public double getWeight() {
        return weight;
    }

    public int getDistance() {
        return distance;
    }

    public void setCalcStrategy(CalcStrategy calcStrategy) {
        this.calcStrategy = calcStrategy;
    }

    public CalcStrategy getCalcStrategy() {
        return calcStrategy;
    }

    public double calcPrice(){
        if (transporter != null){
            return calcStrategy.calcPrice(this.getCalcStrategy());
        }
        return 0.0;
    }


}
