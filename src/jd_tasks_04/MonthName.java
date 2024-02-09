package jd_tasks_04;

//Create a class named MonthName. Given an integer variable named number representing the number
//of the month, write a program that displays the month's name based on the given number.
//
//			Example 1:
//				     number = 10
//
//			Output:
//				  October
//
//			Example 2:
//				     number = -20
//
//			Output:
//				  No such month

public class MonthName {
    public static void main(String[] args) {

        int number =20;

        switch (number){
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("No such month");
        }

    }
}
