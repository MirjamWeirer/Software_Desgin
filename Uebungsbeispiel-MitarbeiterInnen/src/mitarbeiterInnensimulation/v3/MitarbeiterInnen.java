package mitarbeiterInnensimulation.v3;

public class MitarbeiterInnen extends MitarbeiterInnenManager{
    private String name;
    private double umsatz;
    private double gewinn;


    public MitarbeiterInnen(String name, double umsatz,double gewinn) {

        this.name = name;
        this.gewinn = gewinn;
        this.umsatz = umsatz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUmsatz() {
        return umsatz;
    }

    public void setUmsatz(double umsatz) {
        this.umsatz = umsatz;
    }

    public double getGewinn() {
        return gewinn;
    }

    public void setGewinn(double gewinn) {
        this.gewinn = gewinn;
    }


}
