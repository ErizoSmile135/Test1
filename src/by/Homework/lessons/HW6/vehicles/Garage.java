package by.Homework.lessons.HW6.vehicles;

public class Garage<T extends Vehicle> {
    private final T vehicle;

    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isEntryPermitted(){
        return vehicle.getEmissions() < 100;
    }

    public T getVehicle(){
        return vehicle;
    }
}
