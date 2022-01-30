package lab5.zad5;

public class Ksiazka {

    private String tytul;
    private String autor;

    public Ksiazka(String tytul, String autor) {
        this.tytul = tytul;
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }


    public void wypozycz(Klient klient){
        System.out.println("Książka: " + this.tytul + " " + this.autor + " wypozyczona przez: "
                + klient.getImie() + " " + klient.getNazwisko());
    }

    public void czytaj(){
        System.out.println("Książka " + this.getTytul() + " przeczytana.");
    }
}
