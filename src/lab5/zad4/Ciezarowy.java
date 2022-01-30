package lab5.zad4;

public class Ciezarowy extends Samochod {

    private static final int PREDKOSC_MAX = 150;

    public Ciezarowy(int predkosc) {
        super(predkosc);
    }

    public void przypiesz(int a) throws MyException {
        if (a % 2 == 0) {
            try {
                predkosc = PREDKOSC_MAX / a;
                System.out.println("Nowa predkosc: " + predkosc);
            } catch (ArithmeticException ex) {
                ex.printStackTrace();
            }
        } else {
            if (a > PREDKOSC_MAX) {
                throw new MyException("Nie można przyspieszyć");
            }
            super.przyspiesz(a);
        }
    }

}
