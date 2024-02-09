package jd_tasks_10;
//2. Create a class called UpperCaseAndLowerCase and write a program with the following specifications:
//   2.1 Given a string, return true if the total number of uppercase characters is equal to the total number of lowercase characters.
//
//	        Eamplex:
//	            str = "JAVA java";
//
//	        output:
//	            true

public class UpperCaseAndLowerCase {

    public static void main(String[] args) {

        String str = "JAVA java";
        int upperCase = 0;
        int lowercase = 0;


        for (char c : str.toCharArray()) {

            if (Character.isUpperCase(c)) {
                upperCase++;
            }
            if (Character.isLowerCase(c)){
                lowercase++;
            }
        }
        boolean result = upperCase == lowercase;
        System.out.println(result);
    }

}
