package jd_tasks_16;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MergeLists {
    public static void main(String[] args) {

        List<Integer> list1 = List.of(10, 20, 30, 40, 50, 60, 70);
        List<Integer> list2 = List.of(30, 40, 50, 60, 70, 80, 90, 100);


        List<Integer> mergedList = mergeAndRemoveDuplicates(list1, list2);


        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Merged List: " + mergedList);
    }

    public static List<Integer> mergeAndRemoveDuplicates(List<Integer> list1, List<Integer> list2) {
        Set<Integer> mergedSet = new LinkedHashSet<>(list1);
        mergedSet.addAll(list2);


        return new ArrayList<>(mergedSet);
    }
}