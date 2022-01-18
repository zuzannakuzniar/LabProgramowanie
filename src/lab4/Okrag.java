package lab4;

public class Okrag extends Figura {

    private int promien;

    public Okrag(Punkt punkt, int promien) {
        super(punkt);
        this.promien = promien;
    }

    public Okrag() {
    }

    public double getPowierzchnia() {
        return Math.PI * Math.pow(promien, 2);
    }

    public int getSrednica() {
        return 2 * promien;
    }

    public int getPromien() {
        return promien;
    }

    public boolean wSrodku(Punkt punkt) {
        return Math.pow(punkt.getX(), 2) + Math.pow(punkt.getY(), 2) <= promien * promien;
    }

    @Override
    public String opis(String opis) {
        return "opis okrąg :" + opis;
    }
}
