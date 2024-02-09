package jd_tasks_08;
//Create a class called TipCalculator and write a program for a tip calculator. There will be different service
//quality benchmarks that will determine the tip given. There will also be the ability to calculate based on the
//number of people in the party and whether there is a split of the bill.
//
//        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%
//
//      The program should ask the user to enter:
//          - Split or No split (Yes or No),
//          - Enter the number of people (number)
//          - Enter the check amount (number)
//          - Service Quality (String)
//
//      And display the output in the following format:
//
//            Example:
//                  Split or No Split (Yes or No)?
//                  Input: Yes
//                  Enter the number of people:
//                  Input: 4
//                  Enter the check amount:
//                  Input: 476
//                  How was the service quality? (Excellent/Great/Good/Fair/Poor)
//                  Input: Excellent
//
//            Output:
//                 Number of people entered: 4
//                 Total to pay: 595.0
//                 Total tip: 119.0
//                 Total per person: 148.75
//                 Tip per person: 29.75
import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Split or No Split (Yes or No)?");
        String splitOrNot = input.next().toLowerCase();

        while (!(splitOrNot.equals("yes") || splitOrNot.equals("no"))) {
            System.err.println("Invalid entry, please re-enter your answer:");
            splitOrNot = input.next().toLowerCase();
        }

        int numberOfPeople = 1;

        if (splitOrNot.equals("yes")) {
            System.out.println("Enter the number of people:");
            numberOfPeople = input.nextInt();
        }

        while (numberOfPeople <= 0) {
            System.err.println("Invalid entry, please re-enter number of people:");
            numberOfPeople = input.nextInt();
        }

        System.out.println("Enter the check amount:");
        double checkAmount = input.nextDouble();

        while (checkAmount < 0) {
            System.err.println("Invalid entry, please re-enter check amount:");
            checkAmount = input.nextInt();
        }
    }
}
