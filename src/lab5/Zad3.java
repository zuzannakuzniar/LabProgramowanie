package lab5;

public class Zad3 {

    public static void main(String[] args) throws Throwable {
        dlugosc(null);
    }

    private static int dlugosc(String napis) throws Throwable {
        try {
            return napis.length();
        } catch (NullPointerException npe) {
            System.out.println("przechwycone");
            npe.printStackTrace();
            npe.fillInStackTrace();
            throw new Exception(npe);
        }
    }
}
