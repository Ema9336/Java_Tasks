package jd_tasks_10;
//5. Create a class called MoveTheZeros and write a program with the following specifications:
//   5.1 Given an ArrayList, move all zeros to the last indexes of the ArrayList.
//
//	            Example:
//	                list: {1,0,2,0,3,0,4,0}
//
//	            output:
//	                [1, 2, 3, 4, 0, 0, 0, 0]
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class MoveTheZeros {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));
        Collections.sort(list);
        Collections.rotate(list,-4);
        System.out.println(list);
    }

}
