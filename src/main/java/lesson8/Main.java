package lesson8;


public class Main {
    public static void main(String[] args) {

        int summ = 0;

        String[][] array = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] error_array = {{"1", "2", "3", "4"}, {"1", "2", "3", "4", "Лишняя ячейка"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] error_data = {{"1", "2", "3", "4",}, {"1", "2", "3", "4"}, {"1", "2", "текст или %%", "4"}, {"1", "2", "3", "4"}};

        System.out.println("Массив без ошибок:");
        try {
            summ = 0;
            summ = summ(array); // сумма элементов в массиве array

        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Результат суммирования элементов массива равна " + summ);
            System.out.println(" ");
        }
        System.out.println("Массив c исключением ArrayIndexOutOfBoundsException и MyArraySizeException");
        try {
            summ = 0;
            summ = summ(error_array);  // сумма элементов в массиве error_array

        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Результат суммирования элементов массива равна " + summ);
            System.out.println(" ");
        }
        System.out.println("Массив c исключением MyArrayDataException");
        try {
            summ = 0;
            summ = summ(error_data); // сумма элементов в массиве error_data

        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Результат суммирования элементов массива равна " + summ);
            System.out.println(" ");
        }


        System.out.println("Работа программы завершена");
    }

    public static int summ(String[][] array) throws MyArraySizeException, MyArrayDataException {

        int summ = 0;

        if ((array.length != 4) || (array[0].length != 4) || (array[1].length != 4) || (array[2].length != 4)) {
            throw new MyArraySizeException();

        }

            for (int i = -0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {

                    try {
                        summ += Integer.valueOf(array[i][j]);


                    } catch (Exception e) {
                        String message = "в " + i + " ряду, " + j + " ячейке";
                        throw new MyArrayDataException(message);
                    }
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        return summ;



    }
}