package commandv3;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Fernbediengung {
    Map<Integer, Kommando> kommandos = new HashMap<Integer, Kommando>();
    Stack<Kommando> history = new Stack<>();
    public Fernbediengung(){}
    public void setKommando (Integer slot, Kommando k){
        kommandos.put(slot, k);
    }
    public void knopfGedrückt(Integer knopf){
        if (kommandos.containsKey(knopf)){
            Kommando k = kommandos.get(knopf);
            k.ausfuehren();
            history.push(k);
        }
    }
    public void undo (){
        if (!history.isEmpty()){
            history.pop().undo();
        }
    }
}
