package commandv3;

import java.util.Stack;

public class FernseherKanalRunter implements Kommando {
    private Tv tv;
    private Stack<Boolean> history = new Stack<>();
    public FernseherKanalRunter(Tv tv){
        this.tv = tv;

    }
    @Override
    public void ausfuehren() {
        history.add(tv.istEin());
        if (!tv.istEin()) {
            tv.ein();
        } else {
            tv.runter();
        }
    }

    @Override
    public void undo() {
        Boolean istEin = history.pop();
        if (!istEin) {
            tv.aus();
        } else {
            if (tv.getKanal() == 40){
                tv.setKanal(1);
            }else{
                tv.rauf();
            }
        }
    }
}
