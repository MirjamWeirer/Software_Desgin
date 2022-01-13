package commandv3;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class FernseherFernbediengung {
    Map<Integer, Kommando> kommandos = new HashMap<Integer, Kommando>();
    Stack<Kommando> kommandoStack = new Stack<>();
    public FernseherFernbediengung (){}
    public void setKommando (Integer slot, Kommando k){
        kommandos.put(slot, k);
    }
    public void knopfGedrückt(Integer knopf){
        if (kommandos.containsKey(knopf)){
            Kommando k = kommandos.get(knopf);
            k.ausfuehren();
            kommandoStack.push(k);
        }
    }
    public void undo (){
//        if (u.equals("undo")){
//            kommandoStack.pop();
//        }
        kommandoStack.pop();
    }
}
