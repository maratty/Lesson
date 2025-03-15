package lesson9;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {


    // метод удаления removelf (удаляет студентов с оценкой меньше 3, остальных переводит на следующий курс)
    public static void deleteStudents(LinkedList<Student> students) {
        students.removeIf(student -> student.getRating() < 3);
        for (Student s : students) {
            System.out.println("Студент " + s.getName() + " переведён на следующий курс.");
        }

    }

    // Метод печатает на консоль имена тех студентов, которые обучаются на данном курсе.
    public static void printStudents(LinkedList<Student> students, int course) {
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println(s.getName() + " обучается на " + course + " курсе.");
            }
        }
    }

    public static void main(String[] args) {

        LinkedList<Student> students = new LinkedList<>();

        Student st1 = new Student("Марина - мисс универ", "группа ВМК", 1, 1);
        Student st2 = new Student("Вика - квн", "группа МехМат", 2, 3);
        Student st3 = new Student("Кристина - умняшка", "группа ВМК", 1, 4);
        Student st4 = new Student("Леха - футболист", "группа МехМат", 3, 3);
        Student st5 = new Student("Толя - шутник", "группа ВМК", 3, 3);
        Student st6 = new Student("Руслан - гитарист", "группа МехМат", 4, 2);


        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);

        System.out.println("------------------------------------------------------");
        System.out.println("Список студентов, которые переведены на следущий курс:\n");

        deleteStudents(students);

        System.out.println("------------------------------------------------------");
        System.out.println("Список студентов, которые обучаються на данном курсе:\n");

        printStudents(students, 3);

        System.out.println("-------------------THE END----------------------------\n");
        // System.out.println (students);

                                       // Телефонный справочник

        ArrayList<HashMap<String, String>> list = new ArrayList<>();
// Добавляем несколько элементов в список
        System.out.println("Телефонный справочник:");


        HashMap<String, String> map1 = new HashMap<>();
        map1.put("name", ">>Имя<<");
        map1.put("tel", ">>Номер телефона<<");
        list.add(map1);

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("name", "Бритни - ");
        map2.put("tel", "89992222222");
        list.add(map2);

        HashMap<String, String> map3 = new HashMap<>();
        map3.put("name", "Кристи - ");
        map3.put("tel", "89993333333");
        list.add(map3);

        HashMap<String, String> map4 = new HashMap<>();
        map4.put("name", "Кристи - ");
        map4.put("tel", "89994444444");
        list.add(map4);

        // Сортируем список на основе значения "name" в каждой HashMap
        Collections.sort(list, new Comparator<HashMap<String, String>>() {

            public int compare(HashMap<String, String> o1, HashMap<String, String> o2) {
                String name1 = o1.get("name");
                String name2 = o2.get("name");

                return name1.compareTo(name2);
            }
        });

        // Выводим отсортированный список
        for (HashMap<String, String> map : list) {
            System.out.println(map.get("name") + " " + map.get("tel"));
        }
        System.out.println("___________________THE END___________________________");








    }

}

