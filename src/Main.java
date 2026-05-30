import by.Homework.lessons.HW1.task1;
import by.Homework.lessons.HW2.task3;
import by.Homework.lessons.HW2.task4;
import by.Homework.lessons.HW3.task5.task5;
import by.Homework.lessons.HW3.task6.task6;
import by.Homework.lessons.HW3.task7.Student;
import by.Homework.lessons.HW3.task8;

public class Main {
    public static final task1 task1 = new task1();   //разобрать ключевые слова
    public static final task3 task3 = new task3();
    public static final task4 task4 = new task4();
    public static final task5 task5 = new task5();
    public static final task6 task6 = new task6();
    public static final task8 task8 = new task8();

    public static void main(String[] args) {
        /* HW1 (1-2) */
        //task1.printResultTask1();

        /* HW2 (3-4) */
        //task3.printResultTask3();
        //task4.printResultTask4();

        /* HW3 (5-6) */
        //task5.printResultTask5();
        //task6.printResultTask6();

        /* HW2 (7-8) */
        /*Student[] students = new Student[5];

        System.out.println("add students list:");
        System.out.println("******************");
        for (int i = 0; i < 5; i++) {
            students[i] = new Student(
                     i
                    ,"name" + i
                    ,"surname" + i
                    ,"FIT"
                    ,3
                    ,"POIT"
                    ,(int) (Math.random() * 10) + 1
            );
            students[i].info();
            System.out.println("******************");
        }

        System.out.println();
        System.out.println("new students list (mark > 5):");
        for (Student st: students[0].getStudents(students, 5)) {
            if (st == null) break;
            st.info();
            System.out.println("******************");
        }*/

        task8.printResultTask8();

    }
}