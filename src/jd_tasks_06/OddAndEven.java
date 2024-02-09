package jd_tasks_06;
//1. Create a class named OddAndEven:
//
//	1.1 Create a method named isOdd that returns true if a number is odd. Otherwise, it returns false.
//
//			Example:
//				boolean result = isOdd(100);
//
//			Output:
//				false
//
//	1.2 Create a method named isEven that returns true if a number is even. Otherwise, it returns false.
//
//			Example:
//				boolean result = isEven(100);
//
//			Output:
//				true

public class OddAndEven {
    public static void main(String[] args) {

        System.out.println(isOdd(100));
        System.out.println(isEven(100));

    }

    public static boolean isOdd(int num) {
        if (num % 2 == 0) {
            return false;
        }
        return true;
    }

    public static boolean isEven(int num) {
        return !(isOdd(num));
    }
}
