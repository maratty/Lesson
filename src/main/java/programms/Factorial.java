package programms;

public class Factorial {

    // Метод для вычисления факториала
    public long calculate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал не определен для отрицательных чисел.");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}