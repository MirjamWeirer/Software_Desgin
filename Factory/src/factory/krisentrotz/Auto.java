package factory.krisentrotz;

public abstract class Auto {
    protected Enum<AutoTyp> autoTypEnum;

    public Enum<AutoTyp> getAutoTypEnum() {
        return autoTypEnum;
    }

    void hupen(){
        System.out.println(autoTypEnum + " hupt");
    }

    void waschen(){
        System.out.println("Das Auto wird gewaschen");
    }

    @Override
    public String toString() {
        return "--- " + autoTypEnum + " ---";
    }
}
