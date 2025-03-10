package lesson8;

public class MyArraySizeException extends Exception {
    public MyArraySizeException(){
        super("MyArraySizeException и ArrayIndexOutOfBoundsException отработал: некорректные размеры массива");
    }
}