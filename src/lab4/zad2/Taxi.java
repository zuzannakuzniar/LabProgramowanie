package lab4.zad2;

import java.util.Random;

public class Taxi extends Auto {

    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        System.out.println("Sredni przebieg: " + taxi.srPrzebieg());
        System.out.println("Srednie zarobki: " + taxi.srZarobki());
    }

    float[] zarobki;

    public Taxi() {
        super();
        zarobki = new float[12];
        Random r = new Random();
        for (int i = 0; i < 12; i++) {
            zarobki[i] = r.nextInt();
        }
    }

    public float srZarobki() {
        float srednia = 0;
        for (float miesiac : zarobki
        ) {
            srednia += miesiac;
        }
        return srednia / zarobki.length;
    }


}
