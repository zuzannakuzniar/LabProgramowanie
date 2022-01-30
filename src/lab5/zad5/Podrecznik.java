package lab5.zad5;

public class Podrecznik extends Ksiazka {

    public Podrecznik(String tytul, String autor) {
        super(tytul, autor);
    }

    public void czytaj(){
        System.out.println("Podręcznik " + this.getTytul() + " przeczytany");
    }
}
