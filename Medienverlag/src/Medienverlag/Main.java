package Medienverlag;

public class Main {
    public static void main(String[] args) {
        Nachrichtenartikel na = new Nachrichtenartikel();

        PrintAbonnentInnen pA = new PrintAbonnentInnen(na);
        na.setTitleAndInhalt("ÖVP Parteiobmann tritt zurück","Sebastian Kurz gibt seinen Rücktritt aus allen seinen" +
                "politischen Ämter zurück. Er nimmt sich Zeit für seine Familie");
        System.out.println("------------");
        EmailAbonnentInnen eA = new EmailAbonnentInnen(na);
        na.setTitleAndInhalt("Karl Nehammer Kanzler", "Karl Nehammer wird neuer Kanzler. Es wird einige umbildungen in der Regierung geben. Blümel tritt aus Finanzminister zurück.");

    }
}
