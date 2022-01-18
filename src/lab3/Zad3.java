package lab3;

import java.util.Arrays;
import java.util.Scanner;


public class Zad3 {

    public static void main(String[] args) {
        Integer[] bity = new Integer[32];
        Scanner s = new Scanner(System.in);
        double liczba = s.nextDouble();

        int znak = 0;
        if (liczba < 0) {
            znak = 1;
        }
        double ułamek = liczba % 1;
        double wynik = ułamek * 2;
        int licznik = 0;

        do {
            if (wynik > 1) {
                bity[licznik] = 1;
            } else {
                bity[licznik] = 0;
            }
            ułamek = wynik % 1;
            wynik = ułamek * 2;
            licznik++;
        } while (wynik != 1 && licznik <= bity.length);
        bity[licznik] = 1;
        StringBuilder sb = new StringBuilder();
        sb.append("liczba binarnie: ").append(znak).append(",").append(Arrays.deepToString(bity)
                .replaceAll("\\[|\\]", "").replaceAll("null", "")
                .replaceAll(",", ""));
        System.out.println(sb.toString());
    }
}
