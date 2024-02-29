package jd_tasks_17;

import java.util.HashMap;
import java.util.Map;

public class MergeMaps {
    public static void main(String[] args) {

        Map<Character, Integer> map1 = new HashMap<>();
        map1.put('A', 10);
        map1.put('B', 20);

        Map<Character, Integer> map2 = new HashMap<>();
        map2.put('B', 30);
        map2.put('C', 40);

        Map<Character, Integer> mergedMap = mergeMaps(map1, map2);

        System.out.println("Map 1: " + map1);
        System.out.println("Map 2: " + map2);
        System.out.println("Merged Map: " + mergedMap);
    }

    public static <K> Map<K, Integer> mergeMaps(Map<K, Integer> map1, Map<K, Integer> map2) {
        Map<K, Integer> mergedMap = new HashMap<>();

        for (Map.Entry<K, Integer> entry : map1.entrySet()) {
            mergedMap.put(entry.getKey(), entry.getValue());
        }

        for (Map.Entry<K, Integer> entry : map2.entrySet()) {
            K key = entry.getKey();
            int value = entry.getValue();

            mergedMap.merge(key, value, Integer::sum);
        }

        return mergedMap;
    }
}