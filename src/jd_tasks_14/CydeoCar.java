package jd_tasks_14;

public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable {
    public CydeoCar(String model, String color, int year, double price) {
        super("CydeoCar", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("CydeoCar is starting.");
    }

    @Override
    public void drive() {
        System.out.println("CydeoCar is driving.");
    }

    @Override
    public void autoPark() {
        System.out.println("CydeoCar is parking automatically.");
    }

    @Override
    public void selfDrive() {
        System.out.println("CydeoCar is self-driving.");
    }

    @Override
    public void fly() {
        System.out.println("CydeoCar is flying.");
    }
}