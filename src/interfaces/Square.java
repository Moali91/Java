package interfaces;

public class Square implements Shape{

    private double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.width;
    }

    @Override
    public double getArea() {
        return this.width * this.width;
    }
}
