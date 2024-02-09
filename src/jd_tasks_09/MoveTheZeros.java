package jd_tasks_09;
//9. Create a class named MoveTheZeros and write a program that can move all the zeros to the end of the array.
//
//			Example:
//				array = {10, 0, 5, 0, 1, 0};
//
//			Output:
//				{10, 5, 1, 0, 0, 0};

import java.util.Arrays;
import java.util.Collections;

public class MoveTheZeros {

    public static void main(String[] args) {

        int [] array = {10,0,5,0,1,0};

        Arrays.sort(array);

        int[] sortArray = new int [array.length];


        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            sortArray [j] = array[i];
        }
        System.out.println(Arrays.toString(sortArray));

    }

}
