package jd_tasks_14;

public class Samsung extends Phone implements AndroidApps {
    private final String appStoreName;
    private final String os;

    public Samsung(String model, String color, double price, String size, boolean hasBattery, boolean hasPowerButton, String appStoreName, String os) {
        super("Samsung", model, price, color, size, hasBattery, hasPowerButton);
        this.appStoreName = appStoreName;
        this.os = os;
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on Samsung phone");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off Samsung phone");
    }

    @Override
    public void downloadApp() {
        System.out.println("Downloading app from Samsung Galaxy Store");
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