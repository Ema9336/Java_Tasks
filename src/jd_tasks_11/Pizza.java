package jd_tasks_11;
//1. Create a custom class named Pizza with the following specifications:
//
//    Attributes:
//		   size
//		   numberOfCheeseTopping
//		   numberOfPepperoniTopping
//
//	Actions:
//		calcCost(): returns the totalCost of the pizza
//		toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
//
//   Pizza cost is determined by:
//   		Small: $10 + $2 per topping
//   		Medium: $12 + $2 per topping
//   		Large: $14 + $2 per topping
//
//    Create another class named PizzaClients, create multiple pizza objects, and test each function of the pizza object.

public class Pizza {

    public String size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;
    public double calCost = 0.0;

    public Pizza(int numberOfCheeseTopping, int numberOfPepperoniTopping, String size) {
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        this.size = size;
        this.calCost = calCost(size, numberOfCheeseTopping, numberOfPepperoniTopping);

    }

    public double calCost(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping){
        if (size.equalsIgnoreCase("Small")){
            calCost = 10 + (2 * numberOfCheeseTopping) + (2 * numberOfPepperoniTopping) ;
        } else if (size.equalsIgnoreCase("Medium")) {
            calCost = 12 + (2 * numberOfCheeseTopping) + (2 * numberOfPepperoniTopping) ;

        } else if (size.equalsIgnoreCase("Large")) {
            calCost = 14 + (2 * numberOfCheeseTopping) + (2 * numberOfPepperoniTopping) ;
        }
        return calCost;
    }


    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", calCost=" + calCost +
                '}';
    }
}
