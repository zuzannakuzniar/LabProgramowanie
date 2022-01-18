package lab4;

class Trojkat extends Figura {
    int wys = 0;
    int podst = 0;

    public Trojkat(int wys, int podst) {

        this.wys = wys;
        this.podst = podst;

    }

    Trojkat(int wys, int podst, String
            kolor) {
        super(kolor);
        this.wys = wys;
        this.podst = podst;
    }

    public String opis(String opis) {
        return "opis trójkąt :" + opis;
    }

}