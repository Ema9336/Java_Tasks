package jd_tasks_14;

public class Nio extends Car implements AutoPark, AutoPilot {
    public Nio(String model, String color, int year, double price) {
        super("Nio", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Nio is starting.");
    }

    @Override
    public void drive() {
        System.out.println("Nio is driving.");
    }

    @Override
    public void autoPark() {
        System.out.println("Nio is parking automatically.");
    }

    @Override
    public void selfDrive() {
        System.out.println("Nio is self-driving.");
    }
}
