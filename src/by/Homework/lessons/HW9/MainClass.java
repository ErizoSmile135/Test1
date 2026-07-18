package by.Homework.lessons.HW9;

import by.Homework.lessons.HW9.task17.Task17;
import by.Homework.lessons.HW9.task18.Task18;

import java.io.IOException;

public class MainClass  {
    public static void main(String[] args)  throws IOException {
        task17();
        //task18();
        task19();
        task20();
        task21();
    }

    static void task17(){
        Task17 task17 = new Task17();

        task17.writeRelativePath();
        task17.writeAbsolutePath();
        task17.readRelativeFile();      //!!! ошибка
        task17.readAbsoluteFile();      //!!! ошибка

        //2
        by.Homework.lessons.HW9.task17.Car car = new by.Homework.lessons.HW9.task17.Car("Car1", 100, "Country");
        task17.serializeCar(car);
        task17.deserializeCar();
    }

    static void task18(){
        Task18 task18 = new Task18();
        //Не уверен в таком решении подхода к классам в разных пакетах, но другого не знаю пока
        by.Homework.lessons.HW9.task18.Car car1 = new by.Homework.lessons.HW9.task18.Car("name1", "number1", 1000);
        by.Homework.lessons.HW9.task18.Car car2 = new by.Homework.lessons.HW9.task18.Car("name2", "number2", 3000);
        by.Homework.lessons.HW9.task18.Car car3 = new by.Homework.lessons.HW9.task18.Car("name3", "number3", 2000);

        //1-1.2
        /*car1.start();
        car2.start();*/

        //1.3
        /*car1.start();

        try {
            car1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        car2.start();
        car3.start();*/

        //1.4
        by.Homework.lessons.HW9.task18.runnable.Car carR1 = new by.Homework.lessons.HW9.task18.runnable.Car("name1", "number1", 1000);
        by.Homework.lessons.HW9.task18.runnable.Car carR2 = new by.Homework.lessons.HW9.task18.runnable.Car("name2", "number2", 3000);

        Thread thread1 = new Thread(carR1);
        Thread thread2 = new Thread(carR2);

        thread1.start();
        thread2.start();

    }

    static void task19(){

    }

    static void task20(){

    }

    static void task21(){

    }
}
