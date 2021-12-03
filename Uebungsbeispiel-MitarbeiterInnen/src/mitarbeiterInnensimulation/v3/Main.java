package mitarbeiterInnensimulation.v3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MitarbeiterInnenManager manager = new MitarbeiterInnenManager(new UmsatzProvisionsRechner());
        manager.addMitarbeiterInnen(new MitarbeiterInnen("Miri",1500.50,2000));
        manager.addMitarbeiterInnen(new MitarbeiterInnen("Natali",2000,2500));
        manager.addMitarbeiterInnen(new  MitarbeiterInnen("Jasmin",500.50,1000));
        manager.addMitarbeiterInnen(new MitarbeiterInnen("Oliver",1500,1700));
        manager.addMitarbeiterInnen(new MitarbeiterInnen("Dominik",750.50,1050));

        manager.berechnenProvision();
        System.out.println("------------------");
        manager.setProvision(new GewinnProvisionsRechner());
        manager.berechnenProvision();
    }
}
