package jd_tasks_14;

public class Toyota extends Car {
    public Toyota(String model, String color, int year, double price) {
        super("Toyota", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Toyota is starting.");
    }

    @Override
    public void drive() {
        System.out.println("Toyota is driving.");
    }
}
