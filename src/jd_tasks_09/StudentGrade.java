package jd_tasks_09;
// Create a class named StudentGrade and write a program with the following specifications:
//	4.1 Given two arrays with the same length:
//		   studentNames (String[])
//		   scores (int[])
//
//   	4.2 Write a program to determine and store the students' grades in an array of characters named grades.
// 2.3 Print the grade report for each student in separate lines.
//
//			Example:
//				String[] names = {"Anna", "Nancy", "Sarah"};
//				int[] scores = {90, 75, 80};
//
//			Output:
//				grades = {'A', 'C', 'B'};
//				Anna's score is 90, and grade is A
//				Nancy's score is 75, and grade is C
//				Sarah's score is 80, and grade is B

import java.util.Arrays;
public class StudentGrade {

    public static void main(String[] args) {

        String[] names = {"Anna", "Nancy", "Sarah" };
        int[] scores = {90, 75, 80};
        char[] gradees = new char[scores.length];

        for (int i = 0; i < scores.length; i++) {

            if (scores[i] >= 90 && scores[i] <= 100) {
                gradees[i] = 'A';
            } else if (scores[i] >= 80 && scores[i] <= 89) {
                gradees[i] = 'B';
            } else if (scores[i] >= 70 && scores[i] <= 79) {
                gradees[i] = 'C';
            } else if (scores[i] >= 60 && scores[i] <= 69) {
                gradees[i] = 'D';
            } else if (scores[i] >= 0 && scores[i] <= 59) {
                gradees[i] = 'F';
            } else {
                System.out.println("Invalid Score");
            }
        }
        System.out.println("grades = " + Arrays.toString(gradees));

        for (int i = 0; i < 3; i++) {

            System.out.println(names[i] + "'s score is " + scores[i] + ", and grade is " + gradees[i]);

        }
    }

}
