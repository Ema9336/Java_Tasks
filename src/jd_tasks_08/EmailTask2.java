package jd_tasks_08;
//Create a class called EmailTask1. Assume that the email address is constructed by a person's first name followed
//by an underscore and last name. Write a program that can swap the first name with the last name in the email
//(separated by an underscore). If the email doesn't contain an underscore, print the given input email.
//
//        Example:
//              Input:
//                 mike_tyson@gmail.com
//
//              Output:
//                  tyson_mike@gmail.com
import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {

        Scanner email = new Scanner(System.in);

        System.out.println("Enter your e-mail address");

        String newEmail = email.nextLine();

        email.close();

        int indexOfUnderScore = newEmail.indexOf("_");
        int indexOfAt = newEmail.indexOf("@");
        int indexOfDot = newEmail.indexOf(".");

        String firstName = newEmail.substring(0,1).toUpperCase() + newEmail.substring(1, indexOfUnderScore).toLowerCase();
        String secondName = newEmail.substring(indexOfUnderScore +1 , indexOfUnderScore+2).toUpperCase() + newEmail.substring(indexOfUnderScore+2,indexOfAt).toLowerCase();
        String domain = newEmail.substring(indexOfAt+1, indexOfDot);

        System.out.println("First name: " + firstName);
        System.out.println("Second name: " + secondName);
        System.out.println("Domain: " + domain);
    }
}
