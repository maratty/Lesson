package lesson9;


import java.util.HashMap;
import java.util.*;
import java.util.LinkedList;

class Student {
    private String name;
    private String group;
    private int course;
    private int rating;


    public Student(String name, String group, int course, int rating) {

        this.name = name;
        this.group = group;
        this.course = course;
        this.rating = rating;


    }

    // геттеры для private
    public String getName() {
        return name;
    }


    public String getGroup() {
        return group;
    }


    public int getCourse() {
        return course;
    }

    public int getRating() {
        return rating;
    }


    // преопределение toString
    public String toString() {
        return "Студенты{" +
                "Имя =" + name + "\n" +
                "группа = " + group + "\n" +
                "курс = " + course + "\n" +
                "Итоговая оценка =" + rating +
                '}';
    }


    public static List<String> perevodStudents(LinkedList<Student> students) {
        students.removeIf(student -> student.getRating() < 3);
        for (Student s : students) {
            System.out.println(s.getName());
        }

        return List.of();
    }

    public static List<String> getKeyList(HashMap<String, String> map, String value) {
        List<String> keyList = new ArrayList();
        for (String getKey : map.keySet()) {
            if (map.get(getKey).equals(value)) {
                keyList.add(getKey);
            }
        }
        return keyList;
    }

    // Метод печатает на консоль имена тех студентов, которые обучаются на данном курсе.
    public static List<String> printStudents(LinkedList<Student> students, int course) {
        for (Student s : students)
            if (s.getCourse() == course) {
                System.out.println(s.getName() + " обучается на " + course + " курсе.");
            }

        return List.of();
    }

    public static void test() {
        LinkedList<Student> students = new LinkedList<>();

        Student st1 = new Student("Марина", "группа ВМК", 1, 1);
        Student st2 = new Student("Вика", "группа МехМат", 2, 2);
        Student st3 = new Student("Кристина", "группа ВМК", 1, 3);
        Student st4 = new Student("Леха", "группа МехМат", 3, 4);
        Student st5 = new Student("Толя", "группа ВМК", 3, 5);

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        System.out.println("------------------------------------------------------");
        System.out.println("Список студентов, которые переведены на следущий курс:\n");
        perevodStudents(students);

        System.out.println("------------------------------------------------------");
        System.out.println("Список студентов, которые обучаються на данном курсе:\n");
        printStudents(students, 3);

        HashMap<String, String> map = new HashMap();
        map.put("Марина", "1");
        map.put("Вика", "2");
        map.put("Кристина", "3");
        map.put("Леха", "4");
        map.put("Толя", "5");

        System.out.println("------------------------------------------------------");
        System.out.println("Список студентов, которые удалены:");
        System.out.println(Student.getKeyList(map, "1"));
        System.out.println(Student.getKeyList(map, "2"));
    }

}
