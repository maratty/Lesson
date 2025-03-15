package lesson9;


import java.util.LinkedList;

// объявление пееменных
class Student {
    private String name;
    private String group;
    private int course;
    private int rating;

    // конструктор
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


}