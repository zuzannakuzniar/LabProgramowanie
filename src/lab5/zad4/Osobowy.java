package lab5.zad4;

public class Osobowy extends Samochod {

    private static final int PREDKOSC_MAX = 250;

    public Osobowy(int predkosc) {
        super(predkosc);
    }

    public void przyspiesz(int a) throws MyException {
        if (a % 2 == 0) {
            try {
                predkosc = PREDKOSC_MAX / a;
                System.out.println("Nowa predkosc: " + predkosc);

            } catch (ArithmeticException ex) {
                ex.printStackTrace();
            }
        } else {
            if (a > PREDKOSC_MAX) {
                throw new MyException("Nie można przypieszyc");
            }
            super.przyspiesz(a);
        }
    }
}
