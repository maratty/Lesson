package lesson3;

public class Triangle implements Shape {
        double h;
        double a;
        double b;
        double c;
        String colS;
        String colP;

        public Triangle(double h, double a, double b, double c, String colS, String colP) {
            this.h = h;
            this.a = a;
            this.b = b;
            this.c = c;
            this.colS = colS;
            this.colP = colP;
        }

        @Override
        public double calculateArea() {
            return (h * b) / 2;
        }

        @Override
        public double calculatePerimeter() {
            return a + b + c;
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