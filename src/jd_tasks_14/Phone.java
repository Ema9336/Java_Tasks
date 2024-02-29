package jd_tasks_14;

public abstract class Phone extends Device {
    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    public void call(long phoneNum) {
        System.out.println("Calling " + phoneNum);
    }

    public void text(long phoneNum) {
        System.out.println("Texting " + phoneNum);
    }
}