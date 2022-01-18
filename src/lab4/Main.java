package lab4;

public class Main {
    public static void main(String[] args) {
        Prostokat prostokat = new Prostokat(2, 4, "zielony");
        prostokat.przesun(2, 4);
        System.out.println("po przesunięciu: x=" + prostokat.punkt.getX() + " , y=" + prostokat.punkt.getY());
        Kwadrat kwadrat = new Kwadrat(2, 2, "czerwony");
        System.out.println(kwadrat.opis("CZERWONY KWADRAT"));
        System.out.println(prostokat.opis("PROSTOKĄT OPIS"));
    }
}
