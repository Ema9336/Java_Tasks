package jd_tasks_02;
//Create a class called Birthday and declare the following variables with appropriate data types:
//		name
//		birthDay
//		birthMonth
//		birthYear
//
//	Display the birthday of the person in the following format:
//
//		Example:
//			name = "John";
//			birthDay = 25;
//			birthMonth = "April";
//			birthYear = 1995;
//
//		Output:
//			John was born on April 25, 1995.

public class Birthday {
    public static void main(String[] args) {
           String name = "John";
			int birthDay = 25;
			String birthMonth = "April";
			int birthYear = 1995;
        System.out.println(name + " was born on " + birthMonth + " " + birthDay + ", " + birthYear + ".");
    }
}
