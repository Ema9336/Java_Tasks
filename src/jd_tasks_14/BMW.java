package jd_tasks_14;

public class BMW extends Car {
    public BMW(String model, String color, int year, double price) {
        super("BMW", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("BMW is starting.");
    }

    @Override
    public void drive() {
        System.out.println("BMW is driving.");
    }
}