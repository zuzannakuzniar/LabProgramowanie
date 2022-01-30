package lab5.zad5;

public class Main {

    public static void main(String[] args) {
        Ksiegarnia ksiegarnia = new Ksiegarnia();
        Klient klient = new Klient("Z", "K", 1L);
        Ksiazka ksiazka = new Ksiazka("A", "A");
        Podrecznik podrecznik = new Podrecznik("1", "1");
        Powiesc powiesc = new Powiesc("2", "2");

        ksiegarnia.dodajKlienta(klient);
        ksiegarnia.dodajKsiazke(ksiazka);
        ksiegarnia.dodajKsiazke(podrecznik);
        ksiegarnia.dodajKsiazke(powiesc);
        ksiazka.wypozycz(klient);
        podrecznik.wypozycz(klient);
        ksiazka.czytaj();
        podrecznik.czytaj();
        powiesc.czytaj();
    }
}
