package programms;

public class Calculate {


    // Метод для сложения
    public int add(int a, int b) {
        return a + b;
    }

    // Метод для вычитания
    public int subtract(int a, int b) {
        return a - b;
    }

    // Метод для умножения
    public int multiply(int a, int b) {
        return a * b;
    }

    // Метод для деления
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно.");
        }
        return a / b;

    }
}


