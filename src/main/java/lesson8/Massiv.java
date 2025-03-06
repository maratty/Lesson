package lesson8;

public class Massiv {


    public static void printMassiv(int a[][]) {

        int x = a.length;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {

                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }


    public static void summMass(int a[][]) {
        int x = a.length;
        int summ = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                summ += a[i][j];
            }
        }
        System.out.println("Общая сумма всех элементова массива равна: " + summ);

    }


}




