package lab5.zad5;

public class Powiesc extends Ksiazka {

    public Powiesc(String tytul, String autor) {
        super(tytul, autor);
    }

    public void czytaj(){
        System.out.println("Powiesc "+ this.getTytul() +" przeczytana.");
    }
}
