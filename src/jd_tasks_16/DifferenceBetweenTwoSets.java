package jd_tasks_16;

import java.util.HashSet;
import java.util.Set;

public class DifferenceBetweenTwoSets {
    public static void main(String[] args) {

        Set<Integer> set1 = Set.of(1, 2, 3, 5);
        Set<Integer> set2 = Set.of(2, 3, 4);

        Set<Integer> differenceSet = calculateDifference(set1, set2);

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Difference Set: " + differenceSet);
    }

    public static Set<Integer> calculateDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> differenceSet = new HashSet<>(set1);

        differenceSet.removeAll(set2);

        return differenceSet;
    }
}