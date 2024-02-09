package jd_tasks_04;

//Create a class named AgeGroups. An integer variable named age is given.
//	Write a program that can determine the age group of a person. The age groups are:
//
//		Teenager (0 ~ 20)
//		Adult   (21 ~ 55)
//      Senior  (55 or older)
//
//		If the age is negative or greater than 150, print "Invalid."
//
//
//			Example:
//				   age = 42
//
//			Output:
//				  Young Middle-Aged Adult

public class AgeGroups {
    public static void main(String[] args) {

        int age = 42;

        if (age <= 20) {
            System.out.println("Teenager");
        } else if (age <= 40) {
            System.out.println("Young adult");
        } else if (age <=49) {
            System.out.println("Young Middle-Aged Adult");
        } else if (age <= 59) {
            System.out.println("Middle-Aged adult");
        } else if (age <=100) {
            System.out.println("Old adult");
        } else {
            System.out.println("Invalid");
        }

    }
}
