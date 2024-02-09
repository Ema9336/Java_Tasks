package jd_tasks_08;
//Create a class named CombineWords. Ask the user to enter two words. Then, add them together and print. But if the
//last letter of the first word and the first letter of the second word are the same, print that character once.
//
//        Example:
//              Input:
//                 one
//                 eight
//
//              Output:
//                   oneight

import java.util.Scanner;


public class CombineWords {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        System.out.println("Enter the first word:");
        String Word1 = str.nextLine();

        System.out.println("Enter the second word:");
        String Word2 = str.nextLine();

        String combinedWords = combineWords(Word1, Word2);
        System.out.println("Combined Words: " + combinedWords);

        str.close();
    }
    public static String combineWords(String firstWord, String secondWord) {

        if (firstWord.length() > 0 && secondWord.length() > 0 &&
                firstWord.charAt(firstWord.length() - 1) == secondWord.charAt(0)) {
            return firstWord + secondWord.substring(1);
        } else {
            return firstWord + secondWord;
        }
    }
}
