package by.Homework.lessons.HW6.robots;

public class RobotSapper implements Robot, RobotEngineer {
    private String model;
    private int power;
    private String numChassi;
    private String material;
    private boolean isOn;

    public RobotSapper(String model, int power, String numChassi, String material) {
        this.model = model;
        this.power = power;
        this.numChassi = numChassi;
        this.material = material;
        this.isOn = false;
    }

    @Override
    public void on() {
        this.isOn = true;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    @Override
    public void uniquePossibility() {
        System.out.println("сапер саперит");
    }

    @Override
    public void repair() {
        System.out.println("Sapper repair");
    }

    @Override
    public void createItem() {
        System.out.println("создаёт приспособление для разминирования");
    }
}
