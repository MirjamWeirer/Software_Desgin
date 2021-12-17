package factory.krisentrotz;

public class DeutschlandFactory extends Factory{
    @Override
    protected Auto erstelleAuto(Enum<AutoTyp> autoTypEnum) {
        if (autoTypEnum.equals("PKW")){
            return new DeutschlandPKW();
        }else if (autoTypEnum.equals("Sportwagen")){
            return new DeutschlandSportwagen();
        }
       return null;
    }
}
