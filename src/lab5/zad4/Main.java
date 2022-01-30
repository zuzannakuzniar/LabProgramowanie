package lab5.zad4;

public class Main {
    public static void main(String[] args) {
        Ciezarowy ciezarowy = new Ciezarowy(100);
        try {
            ciezarowy.przypiesz(101);
        } catch (MyException ex){
            ex.printStackTrace();
        }
    }
}
