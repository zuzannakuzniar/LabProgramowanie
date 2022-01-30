package lab5.zad4;

public class Samochod {

    int predkosc;

    public Samochod(int predkosc) {
        this.predkosc = predkosc;
    }

    public void przyspiesz(int a) throws MyException {
        int wynik = predkosc + a;
        if (wynik < 0) throw new MyException("Nie można zwolnić");
        predkosc = wynik;
        System.out.println("Nowa predkosc: " + predkosc);

    }

    public int getPredkosc() {
        return predkosc;
    }

    public void setPredkosc(int predkosc) {
        this.predkosc = predkosc;
    }
}
