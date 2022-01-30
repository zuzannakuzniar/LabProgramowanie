package lab5.zad5;

import java.util.HashSet;
import java.util.Set;

public class Ksiegarnia {

    private Set<Ksiazka> ksiazki = new HashSet<>();
    private Set<Klient> klienci = new HashSet<>();


    public void dodajKlienta(Klient klient){
        this.klienci.add(klient);
        System.out.println("Klient dodany do listy klientów");
    }

    public void dodajKsiazke(Ksiazka ksiazka){
        this.ksiazki.add(ksiazka);
        System.out.println("Książka dodana do księgarni");
    }
}
