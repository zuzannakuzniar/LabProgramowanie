package lab5.zad5;

public class Klient {

    private String imie;
    private String nazwisko;
    private Long id;

    public Klient(String imie, String nazwisko, Long id) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
