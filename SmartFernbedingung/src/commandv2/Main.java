package commandv2;

import java.util.Scanner;

public class Main {
    //das ist unser klient im pattern
    public static void main(String[] args) {
        //Fernbedingung ist unser aufrufer (invoker)
        FernseherFernbediengung fb = new FernseherFernbediengung();
        Licht licht = new Licht();
        Tv tv = new Tv();

        LichtAnKommando lkAn = new LichtAnKommando(licht);
        LichtAusKommando lkAus = new LichtAusKommando(licht);
        FernseherKanalHinauf tvAuf = new FernseherKanalHinauf(tv);
        FernseherKanalRunter tvAb = new FernseherKanalRunter(tv);
        //weisen ein Kommando dem Aufrufer zu
        fb.setKommando(1,lkAn);
        fb.setKommando(2,lkAus);
        fb.setKommando(3,tvAuf);
        fb.setKommando(4,tvAb);

        Scanner scanner = new Scanner(System.in);
        while (true){
            String s = scanner.next();
            if(s.equals("q"))
                break;

            try {
                Integer key = Integer.parseInt(s);
                fb.knopfGedrückt(key);

            } catch (NumberFormatException e) {
                System.out.println("Keine gültige Taste!");
            }
        }
    }
}
