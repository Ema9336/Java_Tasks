package jd_tasks_16;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "ccddabaa";
        System.out.println("Example 1: " + areAnagrams(str1, str2));

        String str3 = "xyze";
        String str4 = "xyzd";
        System.out.println("Example 2: " + areAnagrams(str3, str4));
    }

    public static boolean areAnagrams(String str1, String str2) {
        char[] chars1 = str1.replaceAll("(.)(?=.*\\1)", "").toCharArray();
        char[] chars2 = str2.replaceAll("(.)(?=.*\\1)", "").toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }
}