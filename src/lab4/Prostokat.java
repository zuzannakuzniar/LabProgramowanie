package lab4;

class Prostokat extends Figura {
    int wys = 0;
    int szer = 0;

    Prostokat(int wys, int szer) {
        this.wys = wys;
        this.szer = szer;

    }

    Prostokat(int wys, int szer, String
            kolor) {
        super(kolor);
        this.wys = wys;
        this.szer = szer;
    }

    int getPowierzchnia() {
        return (szer * wys);
    }

    void przesun(int x, int y) {
        Punkt punkt = this.punkt;
        punkt.setX(punkt.getX() + x);
        punkt.setY(punkt.getY() + y);
    }

    public String opis(String opis) {
        return "opis prostokąt :" + opis;
    }
}