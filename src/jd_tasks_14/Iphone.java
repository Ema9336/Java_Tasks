package jd_tasks_14;

public class Iphone extends Phone implements AppleApps {
    private final String appStoreName;
    private final String os;

    public Iphone(String model, String color, double price, String size, boolean hasBattery, boolean hasPowerButton, String appStoreName, String os) {
        super("Apple", model, price, color, size, hasBattery, hasPowerButton);
        this.appStoreName = appStoreName;
        this.os = os;
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on iPhone");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off iPhone");
    }

    @Override
    public void downloadApp() {
        System.out.println("Downloading app from Apple App Store");
    }

    @Override
    public String getAppStoreName() {
        return appStoreName;
    }

    @Override
    public String getOS() {
        return os;
    }
}