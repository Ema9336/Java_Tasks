package jd_tasks_10;
//11. Create a class called SameFirstAndLast and write a program with the following specifications:
//    11.1 Given an ArrayList of strings, remove elements if the first and last characters of the string are the same.
//
//			Example:
//				list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}
//
//			output:
//				["Canada", "Lan", "Ebrahim", "Farida"]
import java.util.ArrayList;
import java.util.Arrays;
public class SameFirstAndLast {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                "Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"
        ));

        list.removeIf(p -> p.substring(0, 1).equalsIgnoreCase(p.substring(p.length() - 1)));

        System.out.println(list);

    }

}
