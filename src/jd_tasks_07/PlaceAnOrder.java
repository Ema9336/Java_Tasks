package jd_tasks_07;
//Create a class named PlaceAnOrder:
//
//    Ask the user to enter the product name (multiple words).
//    Ask the user to enter the price (double).
//    Ask the user to enter the quantity (int).
//    Ask the user to enter their first name (String, single word).
//
//    Print in the following format:
//
//        Example:
//             Inputs: "Apples", 1.5, 5, "Luke"
//
//        Output:
//             Luke, your order for 5 Apples has been placed. Your total is 7.5.
import java.util.Scanner;
public class PlaceAnOrder {

    public static void main(String[] args) {

        Scanner product = new Scanner(System.in);
        System.out.println("Enter the product name: ");
        String item = product.nextLine();

        System.out.println("Enter the price: ");
        double price = product.nextDouble();

        System.out.println("Enter the quantity: ");
        int quantity = product.nextInt();

        product.nextLine();

        System.out.println("Enter your first name: ");
        String firstName = product.nextLine();

        double total = quantity*price;

        product.close();

        System.out.println(firstName + " , your order for " + quantity + " " + item + " has " +
                "been placed. Your total is " + total + "." );


    }
}
