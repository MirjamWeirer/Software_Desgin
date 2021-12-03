package mitarbeiterInnensimulation.v3;

public class UmsatzProvisionsRechner implements ProvisonsRechner{
    @Override
    public double provision(MitarbeiterInnen m) {
        return m.getUmsatz() * 0.05;
    }
}
