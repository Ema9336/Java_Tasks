package jd_tasks_07;
//Create a class named MilesToKM and write a program that asks the user to enter the number of miles and
//convert it to kilometers.
//
//        Example:
//             Enter the miles:
//             Input: 10.0
//
//        Output:
//             10.0 miles is equal to 16.09 kilometers

import java.util.Scanner;
public class MilesToKM {

    public static void main(String[] args) {

        Scanner milesToKM = new Scanner(System.in);

        System.out.println("Enter the miles: ");

        double miles = milesToKM.nextDouble();

        double km =  miles * 1.609;

        System.out.println(miles + " miles is equal to " + km + " kilometers");

    }
}
