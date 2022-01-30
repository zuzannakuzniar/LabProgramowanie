package lab5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        double a = 0;
        try {
            a = scanner.nextDouble();
            if (a < 0) {
                throw new IllegalArgumentException("Nie można obliczyć pierwistka z liczby ujemnej.");
            }
            System.out.println(Math.sqrt(a));
        } catch (InputMismatchException e) {
            System.out.println("Błąd, podałeś zły znak.");
        }
    }
}
