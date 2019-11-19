package interfaces;

public class Circle implements Shape {

    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*this.radius*Math.PI;
    }

    @Override
    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }
}
