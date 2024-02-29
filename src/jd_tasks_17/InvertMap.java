package jd_tasks_17;

import java.util.HashMap;
import java.util.Map;

public class InvertMap {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");


        Map<String, Integer> invertedMap = invertMap(map);


        System.out.println("Input Map: " + map);
        System.out.println("Inverted Map: " + invertedMap);
    }

    public static <K, V> Map<V, K> invertMap(Map<K, V> map) {
        Map<V, K> invertedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            invertedMap.put(entry.getValue(), entry.getKey());
        }

        return invertedMap;
    }
}