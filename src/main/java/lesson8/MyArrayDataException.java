package lesson8;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super("\n MyArrayDataException отработал: некорректные данные" + message);
    }
}