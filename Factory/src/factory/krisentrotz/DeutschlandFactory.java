package factory.krisentrotz;

public class DeutschlandFactory extends Factory{
    @Override
    protected Auto erstelleAuto(AutoTyp autoTyp) {
        if (autoTyp == AutoTyp.PKW){
            return new DeutschlandPKW();
        }else if (autoTyp == AutoTyp.Sportwagen){
            return new DeutschlandSportwagen();
        }
       return null;
    }
}
