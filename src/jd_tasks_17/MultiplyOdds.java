package jd_tasks_17;

import java.util.HashMap;
import java.util.Map;

public class MultiplyOdds {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);

        multiplyOdds(map);

        System.out.println("Input Map: " + map);
    }

    public static void multiplyOdds(Map<Character, Integer> map) {
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                entry.setValue(entry.getValue() * 2);
            }
        }
    }
}