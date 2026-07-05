package by.Homework.lessons.HW7;

import by.Homework.lessons.HW7.hospital.*;
import by.Homework.lessons.HW7.university.Faculty;
import by.Homework.lessons.HW7.university.Group;
import by.Homework.lessons.HW7.university.Student;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        Patient patient1 = new Patient(1, "fname1", "lname1", 22, Gender.MALE, "diag1");
        Patient patient2 = new Patient(2, "fname2", "lname2", 23, Gender.FEMALE, "diag2");
        Patient patient3 = new Patient(3, "fname3", "lname3", 24, Gender.MALE, "diag1");
        Patient patient4 = new Patient(4, "fname4", "lname4", 25, Gender.MALE, "diag3");
        Patient patient5 = new Patient(5, "fname5", "lname5", 26, Gender.FEMALE, "diag2");
        Patient patient6 = new Patient(6, "fname6", "lname6", 27, Gender.FEMALE, "diag2");
        Patient patient7 = new Patient(7, "fname7", "lname7", 28, Gender.MALE, "diag3");
        Patient patientCopy1 = new Patient(1, "fname1", "lname1", 22, Gender.MALE, "diag1");

        //Пометка... Set.of неизменяемый, но HashSet изменяемый. В этой обертке работает
        //После 1.8 переписал
        TreeSet<Patient> patientList1 = new TreeSet<>(Set.of(patient1, patient3));
        TreeSet<Patient> patientList2 = new TreeSet<>(Set.of(patient2, patient5, patient6));
        TreeSet<Patient> patientList3 = new TreeSet<>(Set.of(patient4, patient7));

        Ward ward1 = new Ward(1, WardType.MALE_TYPE, patientList1);
        Ward ward2 = new Ward(2, WardType.FEMALE_TYPE, patientList2);
        Ward ward3 = new Ward(3, WardType.MALE_TYPE, patientList3);

        Department department1 = new Department("Dep1", Set.of(ward1));
        Department department2 = new Department("Dep2", Set.of(ward2, ward3));

        //1.4
        //неудачный
        ward1.addPatient(patientCopy1);
        //удачный (хотя этот пациент и есть в другой палате) (без учета диагноза)
        //ward1.addPatient(patient7);
        System.out.println("*************");

        //1.5
        int countMale = 0, countFemale = 0;
        for (Ward ward: department2.getWardSet()){
            for (Patient patient: ward.getPatientList()){
                int temp = patient.getGender() == Gender.MALE ? countMale++ : countFemale++;
            }
        }
        System.out.println("в " + department2.getDepartName() + " мужчин = " + countMale + ", женщин = " + countFemale);

        //1.6
        Patient patient8 = new Patient(8, "fname8", "lname8", 29, Gender.MALE, "diag2");
        Patient patient9 = new Patient(9, "fname9", "lname9", 30, Gender.MALE, "diag1");

        System.out.println("*************");
        //в ward1 мужчины с диагнозом diag1
        for (Ward ward: department1.getWardSet()){
            System.out.println("ward " + ward.getNumber());

            System.out.println("patient8");
            ward.addPatientWithDiagnosis(patient8);
            System.out.println("patient9");
            ward.addPatientWithDiagnosis(patient9);
        }

        //1.7
        System.out.println("*************");
        ward1.printPatientsInfo();

        //1.8
















        /*Student student1 = new Student("Name1", "Lastname1", LocalDate.of(1999, 1, 1), 6.7);
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
        /*List<Student> allStudents = new ArrayList<>();

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

        */
    }
}
