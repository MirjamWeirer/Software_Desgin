package factory.krisentrotz;

public abstract class Factory {
    protected abstract Auto erstelleAuto(Enum<AutoTyp> autoTypEnum);

    public Auto produziereAuto(Enum<AutoTyp> AutoTyp){
        Auto auto = erstelleAuto(AutoTyp);

        System.out.println("---- Produziere " + auto.getAutoTypEnum() + " ----");
        auto.hupen();
        auto.waschen();
        return auto;
    }

}
