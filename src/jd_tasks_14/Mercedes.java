package jd_tasks_14;

public class Mercedes extends Car implements AutoPark {
    public Mercedes(String model, String color, int year, double price) {
        super("Mercedes", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Mercedes is starting.");
    }

    @Override
    public void drive() {
        System.out.println("Mercedes is driving.");
    }

    @Override
    public void autoPark() {
        System.out.println("Mercedes is parking automatically.");
    }
}