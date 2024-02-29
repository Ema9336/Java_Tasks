package jd_tasks_14;

public class DeviceShop {
    public static void main(String[] args) {
        Device device = new Device("ExampleBrand", "ExampleModel", 1000, "Red", "Medium", true, true) {
            @Override
            public void turnOn() {

            }

            @Override
            public void turnOff() {

            }

            @Override
            public void downloadApp() {

            }
        };
        Phone iphone = new Iphone("12", "White", 1200, "Medium", true, true, "AppStore", "iOS");


        device.turnOn();
        device.turnOff();

        iphone.turnOn();
        iphone.turnOff();
        iphone.call(1234567890);
        iphone.text(1234567890);


        iphone.downloadApp();


        System.out.println(device.toString());
        System.out.println(iphone.toString());
    }
}