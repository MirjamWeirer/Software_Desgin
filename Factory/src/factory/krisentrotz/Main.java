package factory.krisentrotz;

public class Main {
    public static void main(String[] args) {
        Factory dF = new DeutschlandFactory();
        Factory eF = new EnglandFactory();


        Auto auto1 = dF.produziereAuto(AutoTyp.PKW);
        Auto auto2 = dF.produziereAuto(AutoTyp.Sportwagen);
        Auto auto3 = eF.produziereAuto(AutoTyp.LKW);
        System.out.println(auto1 + ", " + auto2 + ", " + auto3);
    }
}
