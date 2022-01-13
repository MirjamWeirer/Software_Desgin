package commandv3;

public class FernseherKanalRunter implements Kommando {
    private Tv tv;

    public FernseherKanalRunter(Tv tv){
        this.tv = tv;

    }
    @Override
    public void ausfuehren() {
        if (!tv.istEin()) {
            tv.ein();
        } else {
            tv.runter();
        }
    }

    @Override
    public void undo() {
        if (!tv.istEin()) {
            tv.ein();
        } else {
            tv.rauf();
        }
    }
}
