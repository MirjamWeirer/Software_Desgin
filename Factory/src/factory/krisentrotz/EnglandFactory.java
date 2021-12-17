package factory.krisentrotz;

public class EnglandFactory extends Factory{
    @Override
    protected Auto erstelleAuto(AutoTyp autoTypEnum) {
        if (autoTypEnum == AutoTyp.LKW){
            return new EnglandLKW();
        }
       return null;
    }
}
