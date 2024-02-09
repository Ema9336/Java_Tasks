package jd_tasks_08;
//Create a class named WithoutFirstChar. Ask the user to enter two words. Print the first word without its
//first character, then print the second word without its first character.
//
//        Example:
//              Inputs:
//                  apple
//                  banana
//
//              Output:
//                   ppleanana

import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two words:");
        String firstWord = input.nextLine();
        String secondWord = input.next();

        input.close();

        String firstWord1 = firstWord.substring(1);
        String secondWord2 = secondWord.substring(1);

        String result = firstWord1.concat(secondWord2);

        System.out.println("result: " + result);
    }

}
