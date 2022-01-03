package lab1;

import java.util.Random;
import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {
        //Zad1
        System.out.println(getAge());
        //Zas2
        System.out.println(getName());
        //Zad3
        Scanner s = new Scanner(System.in);
        int a, b;
        System.out.println("Podaj dwie liczby: ");
        a = s.nextInt();
        b = s.nextInt();
        Random r = new Random();
        calculate(r.nextInt(b)-a,r.nextInt(b)-a);
        //Zad4
        System.out.println(isNumberEven(a));
        //Zad5
        System.out.println(isDividedBy5And3(a));
        //Zad6
        System.out.println(getNumberCubed(a));
        //Zad7
        System.out.println(getRoot(a));
        //Zad8
        System.out.println(isTriangleBuildable(r.nextInt(b)-a, r.nextInt(b)-a, r.nextInt(b)-a));


    }

    private static int getAge(){
        return 23;
    }

    private static String getName(){
        return "Zuzanna";
    }

    private static void calculate(int a, int b){
        int suma = a+b;
        int roznica = a-b;
        int iloczyn = a*b;
        System.out.println("Suma: " + suma);
        System.out.println("Różnica: " + roznica);
        System.out.println("Iloczyn: " + iloczyn);
    }

    private static boolean isNumberEven(int a){
        return a % 2 == 0;
    }

    private static boolean isDividedBy5And3(int a){
        return (a%3 == 0) && (a%5==0);
    }

    private static double getNumberCubed(int a){
        return Math.pow(a, 3);
    }

    private static double getRoot(int a){
        return Math.sqrt(a);
    }

    private static boolean isTriangleBuildable(int a, int b, int c){
        if(b > a && b > c){
            if(a+c>b){
                return true;
            }
        } else if(c>b && c>a){
            if(a+b>c){
                return true;
            }
        } else if(b+c>a){
            return true;
        }
        return false;
    }
}
