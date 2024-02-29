package jd_tasks_14;

public abstract class Device {
    private final String brand;
    private final String model;
    private double price;
    private String color;
    private final String size;
    private final boolean hasBattery;
    private final boolean hasPowerButton;

    public Device(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {

        if (brand != null && !brand.isEmpty() &&
                model != null && !model.isEmpty() &&
                color != null && !color.isEmpty() &&
                size != null && !size.isEmpty() &&
                price > 0) {

            this.brand = brand;
            this.model = model;
            this.price = price;
            this.color = color;
            this.size = size;
            this.hasBattery = hasBattery;
            this.hasPowerButton = hasPowerButton;
        } else {
            throw new IllegalArgumentException("Invalid input for device parameters");
        }
    }

    public abstract void turnOn();

    public abstract void turnOff();

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }

    public abstract void downloadApp();
}