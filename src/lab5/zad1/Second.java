package lab5.zad1;

public class Second {
    public static void main(String[] args) {
        First first = new First();
        long a = 10000;
        int b = 21;
        double c = 983.0;
        System.out.println(first.dodaj(a, b));
        System.out.println(first.dodaj(c, b));
        System.out.println(first.dodaj(b, c));
        System.out.println(first.dodaj(a, b, c));
    }
}
