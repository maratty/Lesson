package lesson8;

public class Main {

    public static void main(String args[]) {

        try {

            int a[][] = new int[4][4];

            a[0][0] = 1;
            a[0][1] = 2;
            a[0][2] = 3;
            a[0][3] = 4;
            a[1][0] = 1;
            a[1][1] = 2;
            a[1][2] = 3;
            a[1][3] = 4;
            a[2][0] = 1;
            a[2][1] = 2;
            a[2][2] = 3;
            a[2][3] = 4;
            a[3][0] = 1;
            a[3][1] = 2;
            a[3][2] = 3;
            a[3][3] = 4;


            Massiv myMassiv = new Massiv();
            myMassiv.printMassiv(a);
            myMassiv.summMass(a);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Выход за пределы массива");
        } catch (NumberFormatException ex) {
            System.out.println("Ошибка преобразования из строки в число");
        }

        }
    }






