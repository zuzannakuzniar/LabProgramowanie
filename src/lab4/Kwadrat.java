package lab4;

public class Kwadrat extends Prostokat {

    Kwadrat(int wys, int szer, String kolor) {
        super(wys, szer, kolor);
    }

    @Override
    public String opis(String opis) {
        return "opis kwadrat :" + opis;
    }
}
