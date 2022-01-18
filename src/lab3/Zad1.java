package lab3;

import java.util.Arrays;
import java.util.Random;

public class Zad1 {

    public static void main(String[] args) {
        //Zad1
        int[] tab = new int[10];

        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            tab[i] = r.nextInt(10 + 10) - 10;
            System.out.println(tab[i]);
        }
        double srednia = Arrays.stream(tab).average().getAsDouble();
        System.out.println("średnia: " + srednia);

        System.out.println("max: " + Arrays.stream(tab).max().getAsInt());
        System.out.println("min: " + Arrays.stream(tab).min().getAsInt());
        int mniejsze = 0;
        int wieksze = 0;
        for (int i = 0; i < 10; i++) {
            if (tab[i] > srednia) {
                wieksze++;
            }
            if (tab[i] < srednia) {
                mniejsze++;
            }
        }
        System.out.println("Ilość elementów większych od średniej: " + wieksze);
        System.out.println("Ilość elementów mniejszych od średniej: " + mniejsze);

        for (int i = 9; i >= 0; i--) {
            System.out.println(tab[i]);
        }
    }
}
