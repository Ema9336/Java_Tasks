package jd_tasks_13;

public class IPhone {
    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;
    public IPhone(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);

    }public String getBrand() {
        return brand;

    }public void setBrand(String brand) {
        if (brand==null|| brand.isBlank()|| brand.isEmpty()){

            System.err.println("The brand can not be null, blank or empty.");
            System.exit(1);
        }
        this.brand = brand;

    }public String getModel() {
        return model;

    }public void setModel(String model) {
        if (model==null||model.isBlank()|| model.isEmpty()){
            System.err.println("The model can not be null, blank or empty.");
            System.exit(1);
        }
        this.model = model;

    }public String getSize() {
        return size;

    }public void setSize(String size) {
        this.size = size;

    }public double getPrice() {
        return price;
    }public void setPrice(double price) {
        if (price<0){
            System.err.println("The price must be greater than zero");
            System.exit(1);
        }
        this.price = price;

    }public String getColor() {
        return color;

    }public void setColor(String color) {
        if (color==null|| color.isBlank()|| color.isEmpty()){
            System.err.println("The color can not be null, blank or empty.");
            System.exit(1);
        }
        this.color = color;

    }public void call(String phoneNumber){
        System.out.println("Calling the phone number " + phoneNumber);

    }public void text(String phoneNumber){
        System.out.println("Texting to the number " + phoneNumber);

    }public void faceTime(String phoneNumber){
        System.out.println("Face timing with the number " + phoneNumber);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

}
