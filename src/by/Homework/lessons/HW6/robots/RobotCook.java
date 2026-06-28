package by.Homework.lessons.HW6.robots;

public class RobotCook implements Robot{
    private String model;
    private int power;
    private String country;
    private String unitCook;
    private boolean isOn;

    public RobotCook(String model, int power, String country, String unitCook) {
        this.model = model;
        this.power = power;
        this.country = country;
        this.unitCook = unitCook;
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
        System.out.println("повар готовит");
    }
}
