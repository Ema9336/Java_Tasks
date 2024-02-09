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
public class EmailTask1 {
    public static void main(String[] args) {
        Scanner email = new Scanner(System.in);

        System.out.println("Enter your gmail address");

        String newEmail = email.next();

        email.close();

        if (newEmail.contains("_")) {
            String firstPart = newEmail.substring(0, newEmail.indexOf("_"));
            String secondPart = newEmail.substring(newEmail.indexOf("_") + 1, newEmail.indexOf("@"));
            String domainPart = newEmail.substring(newEmail.indexOf("@"));

            System.out.println(secondPart + "_" + firstPart + domainPart);

        } else {
            System.out.println(newEmail);
        }
    }
}
