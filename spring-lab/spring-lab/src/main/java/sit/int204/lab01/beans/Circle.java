package sit.int204.lab01.beans;

public class Circle implements GeometricShape {
    private double radius = 1.0;

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle: (" + radius + ") -> " + getArea();
    }
}
