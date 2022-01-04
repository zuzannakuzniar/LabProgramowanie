package lab2;

public class Okrag {

    private Punkt srodek;
    private int promien;

    public Okrag(Punkt srodek, int promien) {
        this.srodek = srodek;
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
        return (punkt.getX() < promien || punkt.getX() > -promien)
                && (punkt.getY() < promien || punkt.getY() > -promien);
    }
}
