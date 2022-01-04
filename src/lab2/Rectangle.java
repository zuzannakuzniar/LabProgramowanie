package lab2;

public class Rectangle {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getField() {
        return this.height * this.width;
    }

    public double getCircumference() {
        return (2 * this.height) + (2 * this.width);
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.width, 2));
    }
}
