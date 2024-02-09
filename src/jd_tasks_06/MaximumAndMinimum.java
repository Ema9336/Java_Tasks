package jd_tasks_06;
//3. Create a class named MaximumAndMinimum:
//
//	2.1 Create a method named max that returns the maximum number between two integer numbers.
//
//	2.2 Create a method named max that returns the maximum number between two double numbers.
//
//	2.3 Create a method named min that returns the minimum number between two integer numbers.
//
//	2.4 Create a method named min that returns the minimum number between two double numbers.
//
//
//			Example1:
//				double n = max(10.5, 30.2);
//
//			Output:
//				30.2
//
//			Example2:
//				int m = min(100, 200);
//
//			Output:
//				100

public class MaximumAndMinimum {
    public static void main(String[] args) {

        double n = max(10.5,30.2 );
        System.out.println(n);

        int m = min(100,200);
        System.out.println(m);

    }
    public static int max(int num1, int num2){
        if (num1>num2){
            return num1;
        }else {
            return num2;
        }
    }

    public static double max(double num1, double num2){
        if (num1> num2){
            return num1;
        }
        return num2;
    }

    public static int min(int num1, int num2){
        if (num1< num2){
            return num1;
        }else {
            return num2;
        }
    }
    public static double min(double num1,double num2) {
        if (num1 < num2) {
            return num1;
        }
        return num2;
    }
}
