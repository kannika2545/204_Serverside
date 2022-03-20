package sit.int204.lab01.beans;

public class Rectangle implements GeometricShape {
    private double width = 1.0;
    private double height = 1.0;


    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle: (" + width + " x " + height +
                ") -> " + getArea();
    }
}

