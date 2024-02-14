package jd_tasks_12;
//Create a custom class named Item with the following specifications:
//
//	Attributes:
//		name
//		unitPrice
//		quantity
//
//	Ensure encapsulation for all fields.
//		Conditions:
//			The name cannot be empty or blank.
//			The name cannot contain any special characters other than space.
//			The name must start with letters.
//			The unitPrice cannot be negative.
//			The quantity cannot be negative.
//
//	Add a constructor that enables the user to set all fields during object creation.
//
//	Actions:
//		calcCost(): Returns the total cost.
//		toString(): Displays the name, unit price, quantity, and total cost calculated by calcCost() when the object is printed.

public class Item {
    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {

        return name;
    }

    public double getUnitPrice() {

        return unitPrice;
    }

    public int getQuantity() {

        return quantity;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank() ||
                (!Character.isLetter(name.charAt(0)))) {
            System.err.println("Invalid input/data for the name: " + name);
            System.exit(1);
        }

        char[] eachLetter = name.toCharArray();
        for(char each :eachLetter)

        {
            if (!Character.isLetterOrDigit(each) && !Character.isWhitespace(each)) {
                System.err.println("Invalid input/data for the name: " + name);
                System.exit(1);
            }
        }

        this.name =name;
    }

    public void setUnitPrice ( double unitPrice){
        if (unitPrice < 0) {
            System.err.println("Unit price can not be negative: " + unitPrice);
            System.exit(1);
        }

        this.unitPrice = unitPrice;
    }

    public void setQuantity ( int quantity){
        if (quantity < 0) {
            System.err.println("Quantity can not be negative: " + quantity);
            System.exit(1);
        }
        this.quantity = quantity;
    }

    private double calcCost () {
        return unitPrice * quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }
}
