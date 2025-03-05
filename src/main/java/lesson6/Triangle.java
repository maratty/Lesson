package lesson6;

public class Triangle implements Shape {
    double h;
    double a;
    double b;
    double c;
    String colS; // цвет фона
    String colP; // цвет границ

    public Triangle(double h, double a, double b, double c, String colS, String colP) {
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
        this.colS = colS;
        this.colP = colP;
    }

    public double calculateArea() {
        return (h * b) / 2;
    }

    public double calculatePerimeter() {
        return a + b + c;
    }

    public String colorS() {
        return colS;
    }

    public String colorP() {
        return colP;
    }
}