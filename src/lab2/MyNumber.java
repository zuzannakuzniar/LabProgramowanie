package lab2;

public class MyNumber {
    private double number;

    public MyNumber(double number) {
        this.number = number;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }

    public boolean isOdd() {
        return number % 2 != 0;
    }

    public double sqrt() {
        return Math.sqrt(number);
    }

    public double pow(MyNumber x) {
        return Math.pow(number, x.getNumber());
    }

    public MyNumber add(MyNumber x) {
        return new MyNumber(number + x.getNumber());
    }

    public MyNumber subtract(MyNumber x) {
        return new MyNumber(number - x.getNumber());
    }

    public double getNumber() {
        return number;
    }
}
