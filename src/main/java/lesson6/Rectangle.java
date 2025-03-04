package lesson6;

public class Rectangle implements Shape {
    double length;
    double width;
    String colS;
    String colP;

    public Rectangle(double length, double width, String colS, String colP) {
        this.length = length;
        this.width = width;
        this.colS = colS;
        this.colP = colP;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    @Override
    public String colorS() {
        return colS;
    }

    @Override
    public String colorP() {
        return colP;
    }
}