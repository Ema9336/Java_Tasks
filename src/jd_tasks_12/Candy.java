package jd_tasks_12;
//Create a custom class named Candy with the following specifications:
//
//	Attributes:
//		brand
//		quantity
//		price
//		hasPeanuts
//
//	Ensure encapsulation for all fields.
//		Conditions:
//			The price of candy cannot be set to a negative value.
//			The quantity of candy cannot be set to zero or a negative value.
//
//	Add a constructor that allows the user to set all fields during object creation.
//
//	Actions:
//		toString(): Displays the brand, unit price, and quantity when the object is printed. If the price is zero, display "free" instead of 0.
//
//	Create another class named CandyClients, create multiple candy objects, and test each function of the candy object.

public class Candy {

    private  String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
        this.hasPeanuts = hasPeanuts;
    }

    public String getBrand() {

        return brand;
    }

    public int getQuantity() {

        return quantity;
    }

    public double getPrice() {

        return price;
    }

    public String printFree(){
        if (getPrice() ==0){
            return "free";
        }else {
            return getPrice() + "";
        }
    }

    public boolean isHasPeanuts() {

        return hasPeanuts;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            System.err.println("Quantity can not be negative: " + quantity);
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public void setPrice(double price) {

        if (price==0){
            System.out.println("free");
            System.exit(0);
        }
        if (price < 0) {
            System.err.println("Price can not be negative: " + price);
            System.exit(1);
        }

        this.price = price;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + printFree() +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
