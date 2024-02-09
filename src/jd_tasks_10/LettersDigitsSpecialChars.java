package jd_tasks_10;
//1. Create a class called LettersDigitsSpecialChars and write a program with the following specifications:
//   1.1 Given a string, retrieve and display the letters, digits, and special characters separately.
//   Example:
//
//	        Example:
//	            str = "Wooden Spoon123!"
//
//	        output:
//	            letters= "WoodenSpoon";
//	            Digits = "123";
//	            specialChars = " !";

public class LettersDigitsSpecialChars {

    public static void main(String[] args) {

        String str = "Wooden Spoon123!";
        String digits = "";
        String letters = "";
        String specialChars = "";

        for (char c : str.toCharArray()) {

            if (Character.isDigit(c)) {
                digits += c;
            }
            else if (Character.isLetter(c)) {
                letters += c;
            }
            else {
                specialChars += c;
            }
        }
        System.out.println("Letters = " + letters);
        System.out.println("Digits = " + digits);
        System.out.println("Special Chars = " + specialChars);
    }

}
