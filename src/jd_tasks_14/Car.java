package jd_tasks_14;

public abstract class Car {
    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        if (make != null && !make.isEmpty() &&
                model != null && !model.isEmpty() &&
                year >= 1886 &&
                price >= 0 &&
                color != null && !color.isEmpty()) {

            this.make = make;
            this.model = model;
            this.year = year;
            this.price = price;
            this.color = color;
        } else {
            throw new IllegalArgumentException("Invalid input for car parameters");
        }
    }

    public abstract void start();

    public abstract void drive();

    public void stop() {
        System.out.println("Car has stopped.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public boolean isEligibleForRecall() {

        return false;
    }
}