package jd_tasks_14;

public class Honda extends Car {
    public Honda(String model, String color, int year, double price) {
        super("Honda", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Honda is starting.");
    }

    @Override
    public void drive() {
        System.out.println("Honda is driving.");
    }
}
