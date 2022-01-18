package lab3;

import java.util.Random;

public class Zad2 {

    public static void main(String[] args) {
        int[][] macierz = new int[5][5];
        Random r = new Random();

        int[] tabmax = new int[5];
        int[] tabmin = new int[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                macierz[i][j] = r.nextInt(5 + 5) - 5;
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            int max = macierz[i][0];
            int min = macierz[i][0];
            for (int j = 0; j < 5; j++) {
                if (macierz[i][j] > max) {
                    max = macierz[i][j];
                }
                if (macierz[i][j] < min) {
                    min = macierz[i][j];
                }
            }
            tabmax[i] = max;
            tabmin[i] = min;
        }

        System.out.println("Max:");
        for (int i = 0; i < 5; i++) {
            System.out.print(tabmax[i] + " ");
        }
        System.out.println();
        System.out.println("Min: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(tabmin[i] + " ");
        }
    }
}
