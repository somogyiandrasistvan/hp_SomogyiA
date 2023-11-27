package main;

import java.util.ArrayList;
import java.util.List;

public class HengerProgram {

    private List<Henger> hengerek;

    public static void main(String[] args) {
        new HengerProgram().run();
    }

    public void run() {
        lista();

        System.out.println("Hengerek száma: " + lista().size());
        System.out.println("Átlag térfogat: " + atlagTerfogat());
        System.out.println("Csövek sulya: " + csovekSulya());

    }

    public double atlagTerfogat() {
        double osszeg = 0;

        for (Henger h : lista()) {
            System.out.println(h);
            osszeg += h.terfogat();
        }
        return osszeg / lista().size();
    }

    public double csovekSulya() {
        double suly = 0;

        for (Henger h : lista()) {
            if (h instanceof CsoHenger) {
                suly += ((CsoHenger) h).suly();
            }
        }
        return suly;
    }

    private List<Henger> lista() {
        List<Henger> hengerek = new ArrayList<Henger>();
        hengerek.add(new Henger(1, 1) {
        });
        hengerek.add(new TomorHenger(1, 1) {
        });
        hengerek.add(new CsoHenger(1, 1, 1) {
        });

        return hengerek;
    }

}
