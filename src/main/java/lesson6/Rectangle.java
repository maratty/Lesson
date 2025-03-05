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

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public String colorS() {
        return colS;
    }

    public String colorP() {
        return colP;
    }
}