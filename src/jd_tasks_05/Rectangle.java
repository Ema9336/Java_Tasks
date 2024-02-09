package jd_tasks_05;
//1. Create a class named Rectangle. Use a loop to print the following shape on the console:
//
//			* * * * * * * *
//			* * * * * * * *
//			* * * * * * * *
//			* * * * * * * *
//			* * * * * * * *
//			* * * * * * * *
//			* * * * * * * *
//			* * * * * * * *
//			* * * * * * * *

public class Rectangle {
    public static void main(String[] args) {

      int number = 9;

        for (int i = 1; i <= number ; i++) {
            //stars
            for (int j = 1; j < number ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
