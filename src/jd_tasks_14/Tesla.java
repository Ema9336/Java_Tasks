package jd_tasks_14;

public class Tesla extends Car implements AutoPark, AutoPilot {
    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Tesla is starting.");
    }

    @Override
    public void drive() {
        System.out.println("Tesla is driving.");
    }

    @Override
    public void autoPark() {
        System.out.println("Tesla is parking automatically.");
    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla is self-driving.");
    }
}