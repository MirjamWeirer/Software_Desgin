package factory.krisentrotz;

public abstract class Factory {
    protected abstract Auto erstelleAuto(AutoTyp autoTypEnum);

    public Auto produziereAuto(AutoTyp AutoTyp){
        Auto auto = erstelleAuto(AutoTyp);

        System.out.println("---- Produziere " + auto.getAutoTypEnum() + " ----");
        auto.hupen();
        auto.waschen();
        return auto;
    }

}
