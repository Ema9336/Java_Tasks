package jd_tasks_07;
//Create a class named CentsToDollars and write a program that asks the user to enter the number of cents and
//convert the given cents to dollars. Include any remainder in the result.
//
//        Example:
//             Enter the cents:
//             Input: 225
//
//        Output:
//             225 cents is equal to 2 dollars and 25 cents
import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {


        Scanner cents = new Scanner(System.in);

        System.out.println("Enter the cents: ");

        int amountOfCents = cents.nextInt();
        int n = amountOfCents /100;
        int c = amountOfCents - n *100;

        cents.close();
        System.out.println(amountOfCents + " cents is equal to " + n + " dollars and "

                + c + " cents" );



    }

}
