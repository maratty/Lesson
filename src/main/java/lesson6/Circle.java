package lesson6;

public class Circle implements Shape {
    double radius;
    String colS;
    String colP;

    public Circle(double radius, String colS, String colP) {
        this.radius = radius;
        this.colS = colS;
        this.colP = colP;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public String colorS() {
        return colS;
    }

    public String colorP() {
        return colP;
    }
}
