package jd_tasks_17;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {
    public static void main(String[] args) {
        String inputString = "aabcccdeeeef";

        Map<Character, Integer> uniqueCharacterMap = getUniqueCharactersWithFrequency(inputString);

        System.out.println("Input String: " + inputString);
        System.out.println("Unique Character Map: " + uniqueCharacterMap);
    }

    public static Map<Character, Integer> getUniqueCharactersWithFrequency(String inputString) {
        Map<Character, Integer> uniqueCharacterMap = new HashMap<>();

        char[] charArray = inputString.toCharArray();

        for (char ch : charArray) {
            uniqueCharacterMap.computeIfAbsent(ch, k -> 0);
            uniqueCharacterMap.compute(ch, (key, value) -> value + 1);
        }

        return uniqueCharacterMap;
    }
}