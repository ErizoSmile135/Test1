package by.Homework.lessons.HW7;

import by.Homework.lessons.HW7.university.Faculty;
import by.Homework.lessons.HW7.university.Group;
import by.Homework.lessons.HW7.university.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Student student1 = new Student("Name1", "Lastname1", LocalDate.of(1999, 1, 1), 6.7);
        Student student2 = new Student("Name2", "Lastname2", LocalDate.of(2001, 2, 2), 7.5);
        Student student3 = new Student("Name3", "Lastname3", LocalDate.of(1997, 3, 3), 8.8);
        Student student4 = new Student("Name4", "Lastname4", LocalDate.of(1998, 4, 4), 9.0);

        Group group1 = new Group("GR1");
        Group group2 = new Group("GR2");
        Group group3 = new Group("GR3");

        List<Student> studentsGr1 = new ArrayList<>();
        studentsGr1.add(student1);
        studentsGr1.add(student3);
        List<Student> studentsGr2 = new ArrayList<>();
        studentsGr2.add(student2);
        List<Student> studentsGr3 = new ArrayList<>();
        studentsGr3.add(student4);

        group1.setStudents(studentsGr1);
        group2.setStudents(studentsGr2);
        group3.setStudents(studentsGr3);

        Faculty faculty1 = new Faculty("Fac1");
        Faculty faculty2 = new Faculty("Fac2");

        List<Group> groupsFac1 = new ArrayList<>();
        List<Group> groupsFac2 = new ArrayList<>();
        groupsFac1.add(group1);
        groupsFac2.add(group2);
        groupsFac2.add(group3);

        faculty1.setGroups(groupsFac1);
        faculty2.setGroups(groupsFac2);

        //1.4
        /*group1.getStudents().forEach(st -> System.out.println(st.getName()));
        System.out.println("////////");
        group1.removeStudentsByMark(7);
        group1.getStudents().forEach(st -> System.out.println(st.getName()));*/

        //1.5
        //Пример в факультете
        /*for (Group gr: faculty2.getGroups()){
            System.out.println(gr.getGroupNum());
            for (Student st: gr.getStudents()){
                System.out.println(st.getName());
            }
        }
        faculty2.transferToGroup(faculty2.getGroups().getLast());
        for (Group gr: faculty2.getGroups()){
            System.out.println(gr.getGroupNum());
            for (Student st: gr.getStudents()){
                System.out.println(st.getName());
            }
        }*/
        //Пример группы извне
        /*System.out.println("*** pre ***");
        System.out.println("** f1 **");
        for (Group gr: faculty1.getGroups()){
            System.out.println(gr.getGroupNum());
            for (Student st: gr.getStudents()){
                System.out.println(st.getName());
            }
        }
        System.out.println("** f2 **");
        for (Group gr: faculty2.getGroups()){
            System.out.println(gr.getGroupNum());
            for (Student st: gr.getStudents()){
                System.out.println(st.getName());
            }
        }
        faculty1.transferToGroup(group2);
        System.out.println("*** post ***");
        System.out.println("** f1 **");
        for (Group gr: faculty1.getGroups()){
            System.out.println(gr.getGroupNum());
            for (Student st: gr.getStudents()){
                System.out.println(st.getName());
            }
        }
        System.out.println("** f2 **");
        for (Group gr: faculty2.getGroups()){
            System.out.println(gr.getGroupNum());
            for (Student st: gr.getStudents()){
                System.out.println(st.getName());
            }
        }*/

        //1.6
        //System.out.println("avr " + group1.getGroupNum() + " = " + group1.averageGroupScore());

        //1.9-10
        //Наверное. Мы проходили компоратор, могу ли я им пользоваться вот так
        List<Student> allStudents = new ArrayList<>();

        for (Group gr: faculty1.getGroups()){
            allStudents.addAll(gr.getStudents());
        }
        for (Group gr: faculty2.getGroups()){
            allStudents.addAll(gr.getStudents());
        }

        System.out.println("Как есть: ");
        for (Student st: allStudents){
            System.out.println(st.getName() + ", gpa = " + st.getGpa());
        }
        System.out.println("По возрастанию бала: ");
        allStudents.sort(Comparator.comparingDouble(Student::getGpa));
        for (Student st: allStudents){
            System.out.println(st.getName() + ", gpa = " + st.getGpa());
        }
        System.out.println("По убыванию бала: ");
        allStudents.sort(Comparator.comparingDouble(Student::getGpa).reversed());
        for (Student st: allStudents){
            System.out.println(st.getName() + ", gpa = " + st.getGpa());
        }
    }
}
