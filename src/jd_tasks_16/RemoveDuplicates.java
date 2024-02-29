package jd_tasks_16;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> inputList = List.of(20, 15, 10, 20, 30, 10, 20, 15, 0);


        List<Integer> result = removeDuplicatesAndSort(inputList);


        System.out.println("Input List: " + inputList);
        System.out.println("Output List: " + result);
    }

    public static List<Integer> removeDuplicatesAndSort(List<Integer> inputList) {

        Set<Integer> uniqueSet = new HashSet<>(inputList);


        List<Integer> sortedList = new ArrayList<>(uniqueSet);
        Collections.sort(sortedList);

        return sortedList;
    }
}