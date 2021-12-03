package mitarbeiterInnensimulation.v3;

public class GewinnProvisionsRechner implements ProvisonsRechner{
    @Override
    public double provision(MitarbeiterInnen m) {
       return m.getGewinn() * 0.1;
    }
}
