package beispiel.command;

import java.util.HashMap;
import java.util.Map;

public class FernseherFernbediengung {
    Map<Integer, Kommando> kommandos = new HashMap<Integer,Kommando>();
    public FernseherFernbediengung (){}
    public void setKommando (Integer slot, Kommando k){
        kommandos.put(slot, k);
    }
    public void knopfGedrückt(Integer knopf){
        if (kommandos.containsKey(knopf)){
            Kommando k = kommandos.get(knopf);
            k.ausfuehren();
        }
    }
}
