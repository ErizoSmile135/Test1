package by.Homework.lessons.HW3.task7;

import java.util.ArrayList;
import java.util.List;

public class Student {

    /*  1.  Создать класс Student c полями id (тип int), name (тип String), surname (тип String), faculty (факультет, тип String ),
            course(тип int) , Группа(тип String), средняя оценка (тип int). Инициализацию студента в классе main выполнять через
            конструктор с параметрами. Также определите конструктор без параметров.
        2. Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info
        3. Создать метод, который будет изменять текущую группу студента (сам метод в качестве параметра будет принимать новую группу) cтудента.
        4. Создать метод, который будет возвращать текущую группу студента.
        5. Создать метод, который будет изменять оценку студента и группу студента.
        6. В классе main создать массив из пяти студентов.
        7. Создать метод в классе Student, который будет принимать массив студентов и возвращать из этих студентов,
            массив студентов у которых оценка выше переданной оценке в методе. (Сигнатура метода будет выглядеть так
            PublicStudent[]getStudents(Students[] students, int mark)
        8. В классе main из полученных студентов из задания 7 пройтись в цикле по массиву и вызвать на каждом
            студенте метод info, который вы создавали в задании 2

        Вопросы для проработки:
        1. Что такое класс?
        2. Что такое объект?
        3. Что такое конструктор по умолчанию?
        4. Как создать объект в java?
    */

    private int id;
    private String name;
    private String surname;
    private String faculty;
    private int course;
    private String group;
    private int avr;

    public Student() {
    }

    public Student(int id, String name, String surname, String faculty, int course, String group, int avr) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.avr = avr;
    }

    public void info() {
        System.out.println("Information:");
        System.out.println("id = " + this.id);
        System.out.println("name = " + this.name);
        System.out.println("surname = " + this.surname);
        System.out.println("faculty = " + this.faculty);
        System.out.println("course = " + this.course);
        System.out.println("group = " + this.group);
        System.out.println("avr = " + this.avr);
    }

    public void setGroup(String newGroup) {
        this.group = newGroup;
        System.out.println("Новая группа = " + this.group);
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroupAndAvg(String newGroup, int newAvg) {
        this.group = newGroup;
        this.avr = newAvg;
        System.out.println("Новая группа = " + this.group);
        System.out.println("Новая оценка = " + this.avr);
    }

    public Student[] getStudents(Student[] students, int mark) {
        List<Student> studentsList = new ArrayList<>();

        for (Student st: students){
            if (st.avr > mark) studentsList.add(st);
        }

        Student[] studentsArr = new Student[studentsList.size()];

        for (Student st: studentsList) {
            studentsArr[studentsList.indexOf(st)] = st;
        }

        return studentsArr;
    }
}
