package jd_tasks_16;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {

        Set<Integer> set1 = Set.of(10, 8, 11, 20, 5, 0);
        Set<Integer> set2 = Set.of(30, 0, 20, 40, 50, 10, 60);

        Set<Integer> commonElementsSet = findCommonElements(set1, set2);

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Common Elements Set: " + commonElementsSet);
    }

    public static Set<Integer> findCommonElements(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> commonElementsSet = new HashSet<>(set1);

        commonElementsSet.retainAll(set2);

        return commonElementsSet;
    }
}