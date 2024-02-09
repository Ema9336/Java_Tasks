package jd_tasks_10;
//3. Create a class called DuplicateElements and write a program with the following specifications:
//   3.1 Given an ArrayList, duplicate each element in the list.
//
//		 	Example:
//                list = [1,2,3,4,5];
//
//            output:
//            	[1,2,3,4,5,1,2,3,4,5];
import java.util.ArrayList;
import java.util.Arrays;
public class DuplicateElements {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

    }

}
