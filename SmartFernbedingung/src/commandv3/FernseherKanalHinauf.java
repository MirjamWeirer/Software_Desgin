package commandv3;

import java.util.Stack;

public class FernseherKanalHinauf implements Kommando {
    private Tv tv;
    private Stack<Boolean> history = new Stack<>();
    public FernseherKanalHinauf(Tv tv){
        super();
        this.tv = tv;

    }
    @Override
    public void ausfuehren() {
        history.add(tv.istEin());
        if (!tv.istEin()) {
            tv.ein();
        } else {
            tv.rauf();
        }
    }

    @Override
    public void undo() {
        Boolean istEin = history.pop();
        if (!istEin) {
            tv.ein();
        } else {
            if (tv.getKanal() == 1){
                tv.setKanal(40);
            }else{
                tv.runter();
            }
        }
    }
}
