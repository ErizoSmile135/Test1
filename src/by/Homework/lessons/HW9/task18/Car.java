package by.Homework.lessons.HW9.task18;

public class Car extends Thread {
    private String name;
    private String number;
    private int stopTime;

    public Car(String name, String number, int stopTime) {
        this.name = name;
        this.number = number;
        this.stopTime = stopTime;
    }

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println(name + " едет");
            try {
                Thread.sleep(stopTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}