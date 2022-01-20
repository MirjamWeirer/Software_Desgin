package at.campus02.swd;

public class Rechnung {
    private Berater b;
    private int hour;
    private IStrategie strategie;

    public Rechnung(Berater b, int hour) {
        this.b = b;
        this.hour = hour;
    }

    public Berater getB() {
        return b;
    }

    public void setB(Berater b) {
        this.b = b;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setStrategie (IStrategie strategie){
        this.strategie = strategie;
    }
    public double calcPrice (IStrategie strategie){
        return strategie.calcPrice(this);
    }
}
