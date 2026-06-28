package by.Homework.lessons.HW6.robots;

public class RobotBuilder implements Robot, RobotEngineer{
    private String model;
    private int power;
    private String country;
    private String unitBuild;
    private boolean isOn;

    public RobotBuilder(String model, int power, String country, String unitBuild) {
        this.model = model;
        this.power = power;
        this.country = country;
        this.unitBuild = unitBuild;
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
        System.out.println("строитель строит");
    }

    @Override
    public void createItem() {
        System.out.println("создаёт бетон");
    }
}
