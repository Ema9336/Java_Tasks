package jd_tasks_14;

public class Audi extends Car implements AutoPark {
    public Audi(String model, String color, int year, double price) {
        super("Audi", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Audi is starting.");
    }

    @Override
    public void drive() {
        System.out.println("Audi is driving.");
    }

    @Override
    public void autoPark() {
        System.out.println("Audi is parking automatically.");
    }
}