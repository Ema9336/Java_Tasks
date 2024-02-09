package jd_tasks_04;
//Create a class called GradeLevel. Given a number (byte) gradeLevel, determine and print which
//	school type someone is in. The grade levels and types are:
//
//		1-5: Elementary school
//		6-8: Middle school
//		9-12: High school
//		13-16: College
//		17-18: Grad School
//		For any other grade level, print "Invalid grade level."
//
//			Example:
//				   gradeLevel = 8
//
//			Output:
//				  Middle school

public class GradeLevel {
    public static void main(String[] args) {

        byte gradeLevel = 8;

        if (gradeLevel > 0 && gradeLevel < 19) {
            if (gradeLevel <= 5) {
                System.out.println("Elementary school");
            } else if (gradeLevel <= 8) {
                System.out.println("Middle school");
            } else if (gradeLevel <= 12) {
                System.out.println("High school");
            } else if (gradeLevel <= 16) {
                System.out.println("Collage");
            } else if (gradeLevel <= 18) {
                System.out.println("Grad school");
            }
        }
        else{
            System.out.println("Invalid grade!");
        }

    }
}
