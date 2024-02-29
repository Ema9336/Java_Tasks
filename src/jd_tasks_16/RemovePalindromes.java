package jd_tasks_16;

import java.util.ArrayList;
import java.util.List;

public class RemovePalindromes {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(List.of("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                "reviver", "racecar", "madam"));

        removePalindromes(stringList);

        System.out.println("Input List: " + stringList);
    }

    public static void removePalindromes(List<String> stringList) {
        List<String> nonPalindromes = new ArrayList<>();

        for (String str : stringList) {
            if (!isPalindrome(str)) {
                nonPalindromes.add(str);
            }
        }

        stringList.clear();
        stringList.addAll(nonPalindromes);
    }

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
}