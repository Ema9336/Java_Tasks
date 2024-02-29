package jd_tasks_17;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String inputString = "bbcccaaaaa";

        Map<Character, Integer> frequencyMap = getCharacterFrequency(inputString);

        System.out.println("Input String: " + inputString);
        System.out.println("Frequency Map: " + frequencyMap);
    }

    public static Map<Character, Integer> getCharacterFrequency(String inputString) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        char[] charArray = inputString.toCharArray();

       for (char ch : charArray) {
            frequencyMap.compute(ch, (key, value) -> (value == null) ? 1 : value + 1);
        }

        return frequencyMap;
    }
}