package jd_tasks_07;

// Create a class named Circle and write a program that asks the user to enter the radius of the Circle and calculate
//the area and perimeter of the Circle.
//
//        Example:
//             Enter the radius:
//             Input: 5
//
//        Output:
//             The area of the Circle is 78.5
//             The perimeter of the Circle is 31.4

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the radius of the circle: ");
        double number = input.nextDouble();

        input.close();

        double areaOfCircle = 3.14 * number * number;
        double perimeterofCircle = 2 * number * 3.14;
        perimeterofCircle = Math.round(perimeterofCircle);

        System.out.println("The area of the Circle is " + areaOfCircle);
        System.out.println("The perimeter of the Circle is " + perimeterofCircle);

    }

}
