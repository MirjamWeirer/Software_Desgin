package at.campus02.swd;

public class Transporter {
    private String name;
    private double kilometerFee; // (Kosten pro Kilometer)
    private double kilogramFee; // (Kosten pro Kilogramm)

    public Transporter(String name, double kilometerFree, double kilogrammFree) {
        this.name = name;
        this.kilometerFee = kilometerFree;
        this.kilogramFee = kilogrammFree;
    }

    public String getName() {
        return name;
    }

    public double getKilometerFee() {
        return kilometerFee;
    }

    public double getKilogramFee() {
        return kilogramFee;
    }
}
