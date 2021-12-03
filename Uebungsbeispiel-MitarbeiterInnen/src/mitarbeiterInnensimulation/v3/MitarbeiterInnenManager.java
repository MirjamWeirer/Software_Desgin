package mitarbeiterInnensimulation.v3;

import java.util.ArrayList;
import java.util.List;

public class MitarbeiterInnenManager {
    private List<MitarbeiterInnen> mitarbeiterInnen = new ArrayList<>();
    private ProvisonsRechner provision;

    public MitarbeiterInnenManager(ProvisonsRechner provision) {
        this.provision = provision;
    }

    public MitarbeiterInnenManager() {
    }

    //Im Entenbeispiel haben wir die Strategie über den Konstruktor gesetzt.
    //Das passt wunderbar wenn man nicht mehr vorhat diese zu ändern. In diesem
    //Beispiel soll es möglich sein auch später auf eine andere Provision zu wechseln.
    public void setProvision (ProvisonsRechner p){
        provision = p;
    }

    public void addMitarbeiterInnen (MitarbeiterInnen m){
        mitarbeiterInnen.add(m);
    }

    public void berechnenProvision(){
        if (provision != null){
            for(MitarbeiterInnen m : mitarbeiterInnen){
                System.out.print(m.getName() + " ");
                System.out.println(provision.provision(m));
            }
        }
    }
}
