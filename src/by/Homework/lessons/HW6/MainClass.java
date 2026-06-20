package by.Homework.lessons.HW6;

import by.Homework.lessons.HW6.robots.*;
import by.Homework.lessons.HW6.vehicles.Car;
import by.Homework.lessons.HW6.vehicles.Garage;
import by.Homework.lessons.HW6.vehicles.Motorcycle;

public class MainClass {
    public static void main(String[] args) {
        RobotCook robotCook = new RobotCook("cook123", 100, "Belarus", "food");
        RobotSapper robotSapper = new RobotSapper("sapper2000", 500, "D231", "material");
        RobotBuilder robotBuilder = new RobotBuilder("builder555", 850, "Belarus", "build");

        System.out.println("***********");
        System.out.println("all repair: ");
        robotCook.repair();
        robotSapper.repair();
        robotBuilder.repair();
        System.out.println("***********");

        System.out.println("*** ARR ***");
        Robot[] arr1 = new Robot[3];
        RobotEngineer[] arr2 = new RobotEngineer[2];
        RobotSapper[] arr3 = new RobotSapper[1];

        arr1[0] = robotCook;
        arr1[1] = robotSapper;
        arr1[2] = robotBuilder;

        arr2[0] = robotSapper;
        arr2[1] = robotBuilder;

        arr3[0] = robotSapper;

        System.out.println("*** arr1 ***");
        for(Robot robot: arr1){
            robot.uniquePossibility();
        }

        System.out.println("*** arr2 ***");
        for(RobotEngineer robot: arr2){
            robot.createItem();
        }
        System.out.println("*** arr3 ***");
        for(RobotSapper robot: arr3){
            robot.createItem();
        }

        //hw 12
        System.out.println("///// hw 12 /////");
        Garage<Car> carGarage = new Garage<>(new Car("Car1", 105));
        Garage<Motorcycle> motorcycleGarage = new Garage<>(new Motorcycle("Motorcycle1", 96));

        System.out.println("1. " + carGarage.getVehicle().getName() +
                            ". Въезд " + (carGarage.isEntryPermitted() ? "разрешен": "запрещен"));
        System.out.println("2. " + motorcycleGarage.getVehicle().getName() +
                            ". Въезд " + (motorcycleGarage.isEntryPermitted() ? "разрешен": "запрещен"));
    }
}
