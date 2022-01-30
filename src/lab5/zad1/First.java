package lab5.zad1;

public class First {
    public double dodaj(double x, int y) {
        System.out.println("Zwracany: double \n Argumenty: double x i int y");
        return x + y;
    }

    public int dodaj(long x, int y) {
        System.out.println("Zwracany: int \n Argumenty: long x i int y");

        return (int) (x + y);
    }

    public long dodaj(int x, double y) {
        System.out.println("Zwracany: long \n Argumenty: int x i double y");
        return (long) (x + y);
    }

    public double dodaj(long x, int y, double z) {
        System.out.println("Zwracany: double \n Argumenty: long x i int y i double z");
        return (x + y + z);
    }

}
