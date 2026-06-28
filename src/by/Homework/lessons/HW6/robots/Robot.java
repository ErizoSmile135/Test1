package by.Homework.lessons.HW6.robots;

public interface Robot {
    default void repair(){
        System.out.println("default repair");
    }

    /* abstract - по умолчанию*/
    void on();
    void off();
    void uniquePossibility();
}
