package lab6.zad2;

public class Wieloryb extends Ryby implements Plywanie{
    @Override
    public void plyn() {
        System.out.println("Wieloryb plynie");
    }

    @Override
    public void zanurz() {
        System.out.println("Wieloryb sie zanurza");
    }

    @Override
    public void wynurz() {
        System.out.println("Wieloryb sie wynurza");
    }

    @Override
    public void jedz() {
        System.out.println("Wieloryb je");
    }

    @Override
    public void wydalaj() {
        System.out.println("Wieloryb wydala");
    }
}
