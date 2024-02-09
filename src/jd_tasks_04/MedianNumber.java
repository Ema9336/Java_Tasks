package jd_tasks_04;
// Create a class named MedianNumber. Write a program that finds the median number between
//three DIFFERENT given integers (Assume that the given three integers are distinct numbers).
//
//			Example:
//				   a = 10;
//				   b = 15;
//				   c = 20;
//
//			Output:
//				  15 is the median number

public class MedianNumber {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;
        int result;

        if ((a > b && b > c) || (a < b && b < c)) {
            result = b;
        }else if ((a > c && c > b) || (a < c && c < b)) {
            result = c;
        }else{
            result = a;
        }
        System.out.println(result + " is the median number");

    }
}
