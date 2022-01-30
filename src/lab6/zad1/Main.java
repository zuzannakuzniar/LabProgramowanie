package lab6.zad1;

public class Main {
    public static void main(String[] args) {
        Samochod samochod = new Samochod();
        Statek statek = new Statek();
        Samolot samolot = new Samolot();

        samochod.jedz();
        statek.plyn();
        samolot.lec();
    }
}
