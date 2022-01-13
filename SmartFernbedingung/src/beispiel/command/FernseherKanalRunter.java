package beispiel.command;

public class FernseherKanalRunter implements Kommando{
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
}
