package commandv3;

public class FernseherKanalHinauf implements Kommando {
    private Tv tv;

    public FernseherKanalHinauf(Tv tv){
        super();
        this.tv = tv;

    }
    @Override
    public void ausfuehren() {
        if (!tv.istEin()) {
            tv.ein();
        } else {
            tv.rauf();
        }
    }

    @Override
    public void undo() {
        if (!tv.istEin()) {
            tv.ein();
        } else {
            tv.runter();
        }
    }
}
